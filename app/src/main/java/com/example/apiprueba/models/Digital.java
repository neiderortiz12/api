package com.example.apiprueba.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Digital {
    @SerializedName("nombre_del_punto_vive_digital")
    @Expose
    private String nombreDelPuntoViveDigital;
    @SerializedName("ubicacion")
    @Expose
    private String ubicacion;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("horario_de_atencion_al_publico")
    @Expose
    private String horarioDeAtencionAlPublico;
    @SerializedName("horario_de_atencion_a_estudiantes")
    @Expose
    private String horarioDeAtencionAEstudiantes;
    @SerializedName("servicios_ofrecidos")
    @Expose
    private String serviciosOfrecidos;

    public String getNombreDelPuntoViveDigital() {
        return nombreDelPuntoViveDigital;
    }

    public void setNombreDelPuntoViveDigital(String nombreDelPuntoViveDigital) {
        this.nombreDelPuntoViveDigital = nombreDelPuntoViveDigital;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorarioDeAtencionAlPublico() {
        return horarioDeAtencionAlPublico;
    }

    public void setHorarioDeAtencionAlPublico(String horarioDeAtencionAlPublico) {
        this.horarioDeAtencionAlPublico = horarioDeAtencionAlPublico;
    }

    public String getHorarioDeAtencionAEstudiantes() {
        return horarioDeAtencionAEstudiantes;
    }

    public void setHorarioDeAtencionAEstudiantes(String horarioDeAtencionAEstudiantes) {
        this.horarioDeAtencionAEstudiantes = horarioDeAtencionAEstudiantes;
    }

    public String getServiciosOfrecidos() {
        return serviciosOfrecidos;
    }

    public void setServiciosOfrecidos(String serviciosOfrecidos) {
        this.serviciosOfrecidos = serviciosOfrecidos;
    }
}
