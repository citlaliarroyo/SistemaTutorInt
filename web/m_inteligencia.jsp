<%@ page import="controller.controlador_inteligencias" %>
<%@ page import="include.Inteligencias" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>

<%
    int id_inteligencias = 0;
    try {
        id_inteligencias = Integer.parseInt(request.getParameter("id_inteligencias"));
    }catch (NumberFormatException e){

    }
    controlador_inteligencias cc = new controlador_inteligencias();
    ArrayList<Inteligencias> inteligencias = new ArrayList<Inteligencias>();
    inteligencias = cc.obtenerInteligencias(id_inteligencias);

%>

<div class="container">
    <form class="col s12" action="/modificarinteligencia.jsp" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar Inteligencia</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_inteligencias" name="id_inteligencias" type="number" value="<% out.print(inteligencias.get(0).getId_inteligencias()); %>">
                <label for="id_inteligencias" class="center-align">ID</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="tipo_de_inteligencia" name="tipo_de_inteligencia" type="text" value="<% out.print(inteligencias.get(0).getTipo_de_inteligencia()); %>">
                <label for="tipo_de_inteligencia" class="center-align">TIPO DE INTELIGENCIA</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>

            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="inteligencias.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>