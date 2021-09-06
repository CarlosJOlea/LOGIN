/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class modeloRespuestaServer {
    private  ArrayList <Folios> Folios;

    public modeloRespuestaServer() {
       
    }
    

    public ArrayList<Folios> getFolios() {
        return Folios;
    }

    public void setFolios(ArrayList<Folios> Folios) {
        this.Folios = Folios;
    }
            
}
