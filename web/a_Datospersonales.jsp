<%@ page import="controller.controladordatos_personales" %>
<%@ page import="include.Datos_Personales" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="include.Tipo_Usuario" %>
<%@ page import="include.Datos_Cuenta" %>
<jsp:include page="views/header.jsp"></jsp:include>

<!-- materialize css cdn link -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

<!-- agregar css estilos -->

<style>
    body{
        background-image: url(images/fendi.jpg);
        background-size: cover;
        color: #fff;
    }
    .login{
        margin-top: 100px;
    }
    .login .card{
        background: rgba(0, 0, 0, .6);
    }
    .login label{
        front-size: 16px;
        color: #ccc;
    }
    .login input{
        front-size: 20px;
        color: #fff;
    }
    .login button:hover{
        padding: 0px 40px;
    }

</style>


<!-- Login form -->

<%
    controladordatos_personales cc = new controladordatos_personales();
    ArrayList<Tipo_Usuario> tipo_usuario = new ArrayList<Tipo_Usuario>();
    tipo_usuario = cc.obtenerid_tipoFK();


    String htmlselect = "";
    htmlselect += "<select name=\"id_tipo\">\n" +
            "<option value=\"\" selected disabled>Elige la tipo "+"</option>\n";
    for(int a=0; a<tipo_usuario.size();a++){
        htmlselect += "<option value=\""+tipo_usuario.get(a).getId_tipo()+"\">"+tipo_usuario.get(a).getNombre_tipo_usuario()+"</option>\n";
    }
    htmlselect += "</select>";

%>


<%
    controladordatos_personales ccc = new controladordatos_personales();
    ArrayList<Datos_Cuenta> datos_cuenta = new ArrayList<Datos_Cuenta>();
    datos_cuenta = ccc.obtenerid_usuarioFK();


    String htmlselect1 = "";
    htmlselect1 += "<select name=\"id_usuario\">\n" +"<option value=\"\" selected disabled>Elige la datos cuenta "+"</option>\n";
    for(int b=0; b<datos_cuenta.size();b++){
        htmlselect1 += "<option value=\""+datos_cuenta.get(b).getId_usuario()+"\">"+datos_cuenta.get(b).getUsuario()+"</option>\n";
    }
    htmlselect1 += "</select>";

%>


<div class="container">
    <form class="col s12" action="/creardatos.jsp" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">INSERTAR DATOS PERSONALES</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_datos" name="id_datos" type="number" value="">
                <label for="id_datos" class="center-align">ID</label>
            </div>
            <div class="col s2">
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre" name="nombre" type="text" value="">
                <label for="nombre" class="center-align">NOMBRE</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="a_paterno" name="a_paterno" type="text" value="">
                <label for="a_paterno" class="center-align">APELLIDO PATERNO</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="a_materno" name="a_materno" type="text" value="">
                <label for="a_materno" class="center-align">APELLIDO MATERNO</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="edad" name="edad" type="number" value="" >
                <label for="edad" class="center-align">EDAD</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
               <% out.print(htmlselect);%>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <% out.print(htmlselect1);%>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="datospersonales.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>