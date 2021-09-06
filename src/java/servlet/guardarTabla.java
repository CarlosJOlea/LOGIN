/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Modelo.Folios;
import Modelo.modeloRespuestaServer;
import com.google.gson.Gson;
import controlador.ValidacionEjcucionProcesos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Carlos
 */
@WebServlet("/guardarTabla")
public class guardarTabla extends HttpServlet {

    public ArrayList<Folios> arrayFolios;
    public int contador = 0;
    public String todosLosFolios="";
     public String auxiliar="";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ValidacionEjcucionProcesos valida = new ValidacionEjcucionProcesos();
        String todosLosFolios = request.getParameter("array");
        System.out.println("folios de la tabla scanner" + todosLosFolios);
        
        Gson gson = new Gson();
        modeloRespuestaServer modelorespuestaserver = gson.fromJson(todosLosFolios, modeloRespuestaServer.class);
        arrayFolios = modelorespuestaserver.getFolios();
       
        for(Folios c : arrayFolios){
          
                System.out.println("folio "+ c.getFolios());
                todosLosFolios=c.getFolios();
                auxiliar=auxiliar+" "+todosLosFolios;
             
            }
        
        ValidacionEjcucionProcesos val = new ValidacionEjcucionProcesos();
        val.validarFoliosExistan(auxiliar);
        

    }

}
