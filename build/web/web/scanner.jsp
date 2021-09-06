<%-- 
    Document   : scanner
    Created on : 23 jun. 2021, 10:47:53
    Author     : Carlos
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../css/sidebar.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>

        <%@include file = "/maquetacion/sidebar.jsp"%>


        <div class="home_content" id="scanner">

            Nombre: <input id="nom" style="margin:10px" value="${secionInicio}" type="text"><br><br>
            Folio: <input id="ced" style="margin:20px"  type="text"><br><br>
            <button id="btn_guardar" onclick="guardar()">Guardar</button><br><br>
            <form id="formfolios" method="POST" action="">
                <table >
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Cedula</th>
                        </tr>
                    </thead>
                    <tbody id="tablita">

                    </tbody>
                </table>
                <input type="submit" id="guardarFolios" value="folio">
            </form>
        </div>
        <script src="../jquery/jquery-3.js" type="text/javascript"></script>
        <script src="../jquery/guardarFoliosTabla.js" type="text/javascript"></script>


        <script src="../js/tablaScanner.js" type="text/javascript"></script>
        <script src="../js/sidebar.js" type="text/javascript"></script>   

       


    </body>
</html>
