<%-- 
    Document   : index
    Created on : 9 jun. 2021, 11:32:22
    Author     : Carlos
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <%-- Css bootstrap --%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css" >
        <title>Project Manager</title>
    </head>
    <body>
        <div class="container-fluid cont">
            <div class="row" >
                <div class="col cont">
                    <div class="contenedor">
                        <div class="imagen-log">
                            <img src="img/logo5.png" alt="sofiscal imagen" class="img-logo">
                        </div>
                        <div class="forms">
                            <h2 class="text-center mt-4 mb-4" >Inicia sesión</h2>
                            <form method="POST" action="InicioSecion" >
                                <div class="mb-3 ">
                                    <label for="inputUser" class="form-label">Usuario</label>
                                    <input type="text" class="form-control inputs" id="inputUser" placeholder="Usuario" name="inputUser">
                                </div>
                                <div class="mb-3">
                                    <label for="inputContraseña" class="form-label">Contraseña</label>
                                    <input type="password" class="form-control inputs" id="inputPassword" placeholder="Contraseña" name="inputPassword">
                                </div>
                                <div class="mt-4 text-center " >
                                    <button class="btn btn-danger btnPrimario" type="submit" >Ingresar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <%-- Js bootstrap --%>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    </body>
</html>