<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Datos_Personales" %>
<%@ page import="controller.controladordatos_personales" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Datos Personales</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="a_Datospersonales.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO PATERNO</th>
                    <th>APELLIDO MATERNO</th>
                    <th>EDAD</th>
                    <th>TIPO</th>
                    <th>USUARIO</th>
                </tr>
                </thead>
<%
        String htmlcode = "<tbody>";
        controladordatos_personales cc = new controladordatos_personales();
        int contador = 0;
        ArrayList<Datos_Personales> datospersonales = new ArrayList<Datos_Personales>();
        datospersonales = cc.obtenerdatos_personales();
        if(datospersonales.size() > 0){
            for(int a=0; a<datospersonales.size();a++){
                htmlcode += "<tr><td>" + datospersonales.get(a).getId_datos()
                        + "</td><td>" + datospersonales.get(a).getNombre()
                        + "</td><td>" + datospersonales.get(a).getA_paterno()
                        + "</td><td>" + datospersonales.get(a).getA_materno()
                        + "</td><td>" + datospersonales.get(a).getEdad()
                        + "</td><td>" + datospersonales.get(a).getId_tipo()
                        + "</td><td>" + datospersonales.get(a).getId_usuario()
                        +"</td><td>"
                        + "</td><td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                        + "<a class=\"btn blue\" href=\"m_Datospersonales.jsp?id_datos="+datospersonales.get(a).getId_datos()+"\"><i class=\"material-icons\">create</i></a>"
                        + "<a class=\"btn red\" onclick=\"delete_datos("+ datospersonales.get(a).getId_datos()+")\"><i class=\"material-icons\">delete</i></a>"
                        + "</td></tr>";
            }
        } else{
            htmlcode += "<tr><td colspan=\"10\">No Existen Datos</td></tr>";
        }
    htmlcode += "</tbody>";

    out.print(htmlcode);
%>
            </table>
        </div>
    </div>
</div>

<jsp:include page='views/footer.jsp'></jsp:include>