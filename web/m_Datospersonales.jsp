<%@ page import="controller.controladordatos_personales" %>
<%@ page import="include.Datos_Personales" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    int id_datos = 0;
    try {
        id_datos = Integer.parseInt(request.getParameter("id_datos"));
    }catch (NumberFormatException e){

    }
    controladordatos_personales cc = new controladordatos_personales();
    ArrayList<Datos_Personales> datos_personales = new ArrayList<Datos_Personales>();
    datos_personales = cc.obtenerdatos_personales(id_datos);

%>

<div class="container">
    <form class="col s12" action="/modificardatos.jsp" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar Datos Personales</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_datos" name="id_datos" type="number"  value="<% out.print(datos_personales.get(0).getId_datos()); %>">
                <label for="id_datos" class="center-align">ID</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre" name="nombre" type="text" value="<% out.print(datos_personales.get(0).getNombre()); %>">
                <label for="nombre" class="center-align">NOMBRE</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="a_paterno" name="a_paterno" type="text" value="<% out.print(datos_personales.get(0).getA_paterno()); %>">
                <label for="a_paterno" class="center-align">APELLIDO PATERNO</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="a_materno" name="a_materno" type="text"  value="<% out.print(datos_personales.get(0).getA_materno()); %>">
                <label for="a_materno" class="center-align">APELLIDO MATERNO</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="edad" name="edad" type="number" value="<% out.print(datos_personales.get(0).getEdad()); %>">
                <label for="edad" class="center-align">EDAD</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="id_tipo" name="id_tipo" type="number" value="<% out.print(datos_personales.get(0).getId_tipo()); %>">
                <label for="id_tipo" class="center-align">TIPO</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="id_usuario" name="id_usuario" type="number" value="<% out.print(datos_personales.get(0).getId_usuario()); %>">
                <label for="id_usuario" class="center-align">USUARIO</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="datospersonales.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>