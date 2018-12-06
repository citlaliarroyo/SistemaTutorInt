package servlet;

import  controller.controladordatos_personales;
import  include.Datos_Personales;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearDatospersonales", urlPatterns = {"/CrearDatospersonales"})
public class ServletCrearDatospersonales extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int id_datos = 0;
        String nombre = request.getParameter("nombre");
        String a_paterno = request.getParameter("a_paterno");
        String a_materno = request.getParameter("a_materno");

        int edad = 0;
        int id_tipo = 0;
        int id_usuario = 0;

        try {
            id_datos = Integer.parseInt(request.getParameter("id_datos"));
            edad = Integer.parseInt(request.getParameter("edad"));
            id_tipo = Integer.parseInt(request.getParameter("id_tipo"));
            id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
        } catch (
                NumberFormatException e) {

        }


        Datos_Personales nuevosdatos = new Datos_Personales(id_datos, nombre, a_paterno, a_materno, edad, id_tipo, id_usuario);
        controladordatos_personales cc = new controladordatos_personales();
        if (cc.agregardatos_personales(nuevosdatos)) {
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("Datospersonales.jsp");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
