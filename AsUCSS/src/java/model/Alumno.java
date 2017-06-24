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
public class Alumno {
    private String alumno_id="";
    private String codigo="";
    private String nombre="";
    private String apellido="";
    private String correo="";           
    private String contrasena="";
    private String facultad="";
    private String carrera="";           
    private String preferencias="";

    public Alumno() {
    }

    public Alumno(String alumno_id,String codigo,String nombre,String apellido,String correo,String contrasena,String facultad,String carrera,String preferencias) {
    this.alumno_id=alumno_id;
    this.codigo=codigo;
    this.nombre=nombre;
    this.apellido=apellido;
    this.correo=correo;           
    this.contrasena=contrasena;
    this.facultad=facultad;
    this.carrera=carrera;           
    this.preferencias=preferencias;
    
    }

    public String getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(String alumno_id) {
        this.alumno_id = alumno_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }
    
    
}
