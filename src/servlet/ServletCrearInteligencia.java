package servlet;

import controller.controlador_inteligencias;
import include.Inteligencias;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearInteligencia", urlPatterns = {"/crearinteligencia"})
public class ServletCrearInteligencia extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String tipo_de_inteligencia = request.getParameter("tipo_de_inteligencia");
        int id_inteligencias = 0;

        try {
            id_inteligencias = Integer.parseInt(request.getParameter("id_inteligencias"));
        } catch (NumberFormatException e) {

        }

        Inteligencias nuevaInteligencia = new Inteligencias(id_inteligencias, tipo_de_inteligencia);
        controlador_inteligencias cc = new controlador_inteligencias();
        if(cc.agregarInteligencias(nuevaInteligencia)) {
            response.sendRedirect("inteligencias.jsp");
        } else {
            response.sendRedirect("crearinteligencia.jsp");
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
