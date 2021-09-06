<%-- 
    Document   : profile
    Created on : 8 jun. 2021, 11:07:38
    Author     : PC
--%>

<%@page import="controlador.Consultas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Usuario" %>
<!DOCTYPE html>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Estilos de bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <link href="css/sidebar.css" rel="stylesheet" type="text/css"/>

        <!-- CDN de Boxicons -->
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>

        <title>Sofiscal</title>
    </head>

    <body>

        <div class="sidebar">
            <div class="logo_content">
                <div class="logo">
                    <i class='bx bxl-gitlab'></i>
                    <div class="logo_name">
                        Sofiscal
                    </div>
                </div>
                <i class='bx bx-menu' id="boton"></i>
            </div>
            <ul class="nav_list">
                <li>
                    <a href="#">
                        <i class='bx bxs-user'></i>
                        <span class="links_name">Usuario</span>
                    </a>
                    <span class="tooltip">Usuario</span>
                </li>
                <li>
                    <a href="../web/scanner.jsp">
                        <i class='bx bx-barcode'></i>
                        <span class="links_name">Scanner</span>
                    </a>
                    <span class="tooltip">Scanner</span>
                </li>
                <li>
                    <a href="../web/factores.jsp">
                        <i class='bx bx-table'></i>
                        <span class="links_name">Factores</span>
                    </a>
                    <span class="tooltip">Factores</span>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-pie-chart'></i>
                        <span class="links_name">Analitycs</span>
                    </a>
                    <span class="tooltip">Analitycs</span>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-folder'></i>
                        <span class="links_name">Archivos</span>
                    </a>
                    <span class="tooltip">Archivos</span>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-cog'></i>
                        <span class="links_name">Configuracion</span>
                    </a>
                    <span class="tooltip">Configuracion</span>
                </li>
            </ul>
            <div class="profile_content">
                <div class="profile">
                    <div class="profile_details">
                        <!--<img src="background2.jpg" alt="profile">-->
                        <img src=${imagen} />
                        <div class="name_job">
                            <div class="name">${secionInicio}</div>
                            <div class="job">${puesto}</div>
                        </div>
                    </div>
                    <form method="POST" action="logout" > <i class='bx bx-log-out' id="log_out"></i></form>>
                </div>
            </div>
        </div>
                           

        <div class="home_content">

        </div>
                         

        <!-- js de sidebar -->
        <script src="js/sidebar.js" type="text/javascript"></script>
        <!-- Js de bootstrap  -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
        crossorigin="anonymous"></script>
    </body>

</html>