/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


/**
 *
 * @author Carlos
 */
public class ValidacionEjcucionProcesos extends Conexion{
    
    public  void validarFoliosExistan(String allFolios){
        allFolios = allFolios.substring(1);
        allFolios = allFolios.replaceAll(" ", "','");
        allFolios = "'"+allFolios+"'";
        System.out.println(allFolios);
    }
 
}
