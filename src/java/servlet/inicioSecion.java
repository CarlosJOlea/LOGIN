/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.Consultas;
import controlador.*;
import Modelo.*;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author carlos
 */
@WebServlet("/InicioSecion")
public class inicioSecion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean acceso = false;
        Consultas con = new Consultas();
        Usuario user = new Usuario();
        String usuario = request.getParameter("inputUser");
        String password = con.encrypt(request.getParameter("inputPassword"));

        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);


        if (con.autenticacion(usuario, password)) {
            System.out.println(""+con.autenticacion(usuario, password));
            Usuario datosUsuario = con.datosUsuario(usuario, password);
            request.getSession().setAttribute("secionInicio", datosUsuario.getNombre());
            request.getSession().setAttribute("imagen", datosUsuario.getImagenperfil());
            request.getSession().setAttribute("puesto", datosUsuario.getPuesto());
            response.sendRedirect("web/inicio.jsp");

        } else {
            response.sendRedirect("index.jsp");
            
             System.out.println(""+con.autenticacion(usuario, password));
        }
    }
}
