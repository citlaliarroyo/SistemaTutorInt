<%@ page import="include.Inteligencias" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="controller.controlador_inteligencias" %>

<%

    int id_inteligencias = 0;
    String tipo_de_inteligencia = request.getParameter("tipo_de_inteligencia");


    try {
        id_inteligencias = Integer.parseInt(request.getParameter("id_inteligencias"));
    } catch (NumberFormatException e){

    }


    Inteligencias nuevainteligencia = new Inteligencias( id_inteligencias, tipo_de_inteligencia);
    controlador_inteligencias cc = new controlador_inteligencias();
    if(cc.actualizarInteligencias(nuevainteligencia)) {
        response.sendRedirect("inteligencias.jsp");
    } else {
        response.sendRedirect("m_inteligencia.jsp?id_inteligencias=" + id_inteligencias);
    }
%>
