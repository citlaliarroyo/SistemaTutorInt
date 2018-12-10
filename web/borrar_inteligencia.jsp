<%@ page import="controller.controlador_inteligencias" %>
<%
    int id_inteligencias  = 0;
    try {
        id_inteligencias = Integer.parseInt(request.getParameter("id_inteligencias"));
    }catch (NumberFormatException e){

    }
    controlador_inteligencias cc = new controlador_inteligencias();
    if(cc.eliminarInteligencias(id_inteligencias)){
        response.sendRedirect("inteligencias.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>