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
public class Estado {
    String estado_id="";
    String tipoestado="";
    String horario="";
    String fecha="";
    String observacion="";
    public Estado(String estado_id,String tipoestado,
            String horario,String fecha,String observacion)
    {
    this.estado_id=estado_id;
    this.tipoestado=tipoestado;
    this.horario=horario;
    this.fecha=fecha;
    this.observacion=observacion;
    }

    public String getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(String estado_id) {
        this.estado_id = estado_id;
    }

    public String getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(String tipoestado) {
        this.tipoestado = tipoestado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
