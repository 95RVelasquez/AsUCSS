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
public class Aula {
    String aula_id="";
    String sede_id="";
    String salon="";
    String estado_id="";

    public Aula(String aula_id,String sede_id,String salon,String estado_id) {
        this.aula_id=aula_id;
        this.sede_id=sede_id;
        this.salon=salon;
        this.estado_id=estado_id;
    }

    public Aula() {
    }

    public String getAula_id() {
        return aula_id;
    }

    public void setAula_id(String aula_id) {
        this.aula_id = aula_id;
    }

 
    public void setSede_id(String sede_id) {
        this.sede_id = sede_id;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(String estado_id) {
        this.estado_id = estado_id;
    }
    
    
    
}
