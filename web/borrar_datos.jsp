<%@ page import="controller.controladordatos_personales" %>
<%
    int id_datos  = 0;
    try {
        id_datos = Integer.parseInt(request.getParameter("id_datos"));
    }catch (NumberFormatException e){

    }
    controladordatos_personales cc = new controladordatos_personales();
    if(cc.eliminardatos_personales(id_datos)){
        response.sendRedirect("datospersonales.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
