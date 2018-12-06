<jsp:include page="../views/header.jsp"></jsp:include>

<div class="container">
    <form class="col s12" action="/CrearDatospersonales.jsp" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">INSERTAR DATOS PERSONALES</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_datos" name="id_datos" type="text" value="">
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
                <input id="edad" name="edad" type="text" value="" >
                <label for="edad" class="center-align">EDAD</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <select name="id_tipo" class="z">
                    <option>SELECCIONE</option>
                    <option value="Administrador">1</option>
                    <option value="Empleado">2</option>
                    <option value="Directora">3</option>



                </select>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <select name="id_usario" class="p">
                    <option>SELECCIONE</option>
                    <option value="Citlali">1</option>
                    <option value="Puchi">2</option>
                    <option value="Israel">3</option>
                    <option value="Carlos">4</option>

                </select>
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
                <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='../views/footer.jsp'></jsp:include>
