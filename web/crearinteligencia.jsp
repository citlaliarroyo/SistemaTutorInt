<%@ page import="include.Inteligencias" %>
<%@ page import="controller.controlador_inteligencias" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int id_inteligencias = 0;

    String tipo_de_inteligencia = request.getParameter("tipo_de_inteligencia");


    try {

        id_inteligencias = Integer.parseInt(request.getParameter("id_inteligencias"));

    }catch (NumberFormatException e) {

    }

    Inteligencias nuevainteligencia = new Inteligencias(id_inteligencias, tipo_de_inteligencia);
    controlador_inteligencias cc = new controlador_inteligencias();
    if(cc.agregarInteligencias(nuevainteligencia)) {
        response.sendRedirect("inteligencias.jsp");
    } else {
        response.sendRedirect("inteligencia.jsp");
    }
%>
