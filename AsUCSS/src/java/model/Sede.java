/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rony VC
 */
public class Sede {
     
    String sede_id="";
    String nombre="";
    public Sede(String sede_id,String nombre)
    {
        this.sede_id=sede_id;
        this.nombre=nombre;
    }
    public Sede(){}
    public String getSede_id()
    {
        return sede_id;
    }
    public void setSede_id(String sede_id)
    {
        this.sede_id=sede_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
