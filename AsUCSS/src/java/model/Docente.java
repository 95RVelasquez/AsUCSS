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
public class Docente {
    String docente_id="";
    String nombre="";
    String apellido="";
    String correo="";
    String especialidad="";
    String user="";
    String contrasena="";
    String web="";
    String descripcion="";
    String tipo="";

    public Docente(String docente_id,String nombre,String apellido,String correo, String especialidad,String user,String contrasena,String web,String descripcion,String tipo) {
            this.docente_id=docente_id;
            this.nombre=nombre;
            this.apellido=apellido;
            this.correo=correo;
            this.especialidad=especialidad;
            this.user=user;
            this.contrasena=contrasena;
            this.web=web;
            this.descripcion=descripcion;
            this.tipo=tipo;

    }

    public Docente() {
        
    }
    public String getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(String docente_id) {
        this.docente_id = docente_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
