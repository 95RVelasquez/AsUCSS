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
public class Asesoria {
    String asesoria_id="";
    String curso="";
    String descripcion="";
    String admin_id="";
    String aula_id="";
    String docente_id="";
    String  fechainicio="";
    String fechafin="";
    String estado="";

    public Asesoria() {
    }

    public Asesoria(String asesoria_id,String curso,String descripcion,String admin_id,String aula_id,
            String docente_id,String  fechainicio,String fechafin,String estado) {
            this.asesoria_id=asesoria_id;
            this.curso=curso;
            this.descripcion=descripcion;
            this.admin_id=admin_id;
            this.aula_id=aula_id;
            this.docente_id=docente_id;
            this.fechainicio=fechainicio;
            this.fechafin=fechafin;
            this.estado=estado;
    }

    public String getAsesoria_id() {
        return asesoria_id;
    }

    public void setAsesoria_id(String asesoria_id) {
        this.asesoria_id = asesoria_id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAula_id() {
        return aula_id;
    }

    public void setAula_id(String aula_id) {
        this.aula_id = aula_id;
    }

    public String getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(String docente_id) {
        this.docente_id = docente_id;
    }

  

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    
}
