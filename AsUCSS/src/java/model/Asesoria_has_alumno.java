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
public class Asesoria_has_alumno {
    String Asesoria_asesoria_id="";
    String Alumno_alumno_id="";

    public Asesoria_has_alumno( String Asesoria_asesoria_id,String Alumno_alumno_id)
    {
     this.Asesoria_asesoria_id=Asesoria_asesoria_id;
     this.Alumno_alumno_id=Alumno_alumno_id; 
    }

    public Asesoria_has_alumno() {
    }

    public String getAsesoria_asesoria_id() {
        return Asesoria_asesoria_id;
    }

    public void setAsesoria_asesoria_id(String Asesoria_asesoria_id) {
        this.Asesoria_asesoria_id = Asesoria_asesoria_id;
    }
    public String getAlumno_alumno_id() {
        return Alumno_alumno_id;
    }

    public void setAlumno_alumno_id(String Alumno_alumno_id) {
        this.Alumno_alumno_id = Alumno_alumno_id;
    }
    
}
