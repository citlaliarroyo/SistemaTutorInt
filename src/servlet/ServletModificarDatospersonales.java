package servlet;

import controller.controladordatos_personales;
import  include.Datos_Personales;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarDatospersonales", urlPatterns = {"/modificardatos"})
public class ServletModificarDatospersonales extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String a_paterno = request.getParameter("a_paterno");
        String a_materno = request.getParameter("a_materno");

        int id_datos = 0;
        int edad = 0;
        int id_tipo = 0;
        int id_usuario = 0;

        try{
            id_datos = Integer.parseInt(request.getParameter("id_datos"));
            edad = Integer.parseInt(request.getParameter("edad"));
            id_tipo = Integer.parseInt(request.getParameter("id_tipo"));
            id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
        }catch (NumberFormatException e){
    }

        Datos_Personales nuevosdatos = new Datos_Personales(id_datos, nombre, a_paterno, a_materno, edad, id_tipo, id_usuario);
        controladordatos_personales cc = new controladordatos_personales();
        if (cc.actualizardatos_personales(nuevosdatos)) {
            response.sendRedirect("datospersonales.jsp");
        } else {
            response.sendRedirect("modificardatos.jsp?id_datos=" + id_datos );
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
