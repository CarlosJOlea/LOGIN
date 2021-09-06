<%-- 
    Document   : tabla
    Created on : 15 jun. 2021, 9:18:54
    Author     : Carlos
--%>

<%@page import="controlador.Consultas"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Usuario"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/tabla.css" rel="stylesheet" type="text/css"/>

        <!-- Estilos de bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <link href="css/sidebar.css" rel="stylesheet" type="text/css"/>

        <!-- CDN de Boxicons -->
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="home_content">
            <table >
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>nombre</th>
                        <th>apellido</th>
                        <th>telefono</th>
                        <th>correo</th>
                        <th>usuario</th>
                        <th>Montos</th>
                        <th></th>
                        <th></th>

                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
           

            <!-- Modal -->
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                           
                           <input type="text">
                            Fecha 1 
                           <input type="text">
                          Monto1
                           <input type="text">
                            Fecha 2
                           <input type="text">
                          Monto 2 
                           <input type="text">
                          Fecha 3 
                           <input type="text">
                           Monto 3
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
    <script src="../js/modal.js" type="text/javascript"></script>
    <%-- Js bootstrap --%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</body>
</html>
