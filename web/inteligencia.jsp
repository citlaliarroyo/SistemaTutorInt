<jsp:include page="views/header.jsp"></jsp:include>

<!-- materialize css cdn link -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

<!-- agregar css estilos -->

<style>
    body{
        background-image: url(images/gucci.jpg);
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
<div class="container">
    <form class="col s12" action="/crearinteligencia.jsp" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Inteligencia</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_inteligencias" name="id_inteligencias" type="number" value="">
                <label for="id_inteligencias" class="center-align">ID</label>
            </div>
            <div class="col s2">
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="tipo_de_inteligencia" name="tipo_de_inteligencia" type="text" value="">
                <label for="tipo_de_inteligencia" class="center-align">TIPO DE INTELIGENCIA</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">

            </div>
            <div class="input-field col s8">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="inteligencias.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>