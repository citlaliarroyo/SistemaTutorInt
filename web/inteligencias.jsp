<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Inteligencias" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="controller.controlador_inteligencias" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Inteligencia</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="inteligencia.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>TIPO DE INTELIGENCIA</th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controlador_inteligencias cc = new controlador_inteligencias();
                    int contador = 0;
                    ArrayList<Inteligencias> inteligencias = new ArrayList<Inteligencias>();
                    inteligencias = cc.obtenerInteligencias();
                    if(inteligencias.size() > 0){
                        for(int a=0; a<inteligencias.size();a++){
                            htmlcode += "<tr><td>" + inteligencias.get(a).getId_inteligencias()
                                    + "</td><td>" + inteligencias.get(a).getTipo_de_inteligencia()
                                    +"</td><td>"
                                    + "</td><td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_inteligencia.jsp?id_inteligencias="+inteligencias.get(a).getId_inteligencias()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"delete_inteligencia("+ inteligencias.get(a).getId_inteligencias()+")\"><i class=\"material-icons\">delete</i></a>"
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



