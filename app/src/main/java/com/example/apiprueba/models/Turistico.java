package com.example.apiprueba.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Turistico {

    @SerializedName("idsitio")
    @Expose
    private String idsitio;
    @SerializedName("idtipo")
    @Expose
    private String idtipo;
    @SerializedName("iddescripcion")
    @Expose
    private String iddescripcion;
    @SerializedName("idubicacion")
    @Expose
    private String idubicacion;
    @SerializedName("iddistanciacascourbano")
    @Expose
    private String iddistanciacascourbano;
    @SerializedName("latitud")
    @Expose
    private String latitud;
    @SerializedName("longitud")
    @Expose
    private String longitud;

    public String getIdsitio() {
        return idsitio;
    }

    public void setIdsitio(String idsitio) {
        this.idsitio = idsitio;
    }

    public String getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(String idtipo) {
        this.idtipo = idtipo;
    }

    public String getIddescripcion() {
        return iddescripcion;
    }

    public void setIddescripcion(String iddescripcion) {
        this.iddescripcion = iddescripcion;
    }

    public String getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(String idubicacion) {
        this.idubicacion = idubicacion;
    }

    public String getIddistanciacascourbano() {
        return iddistanciacascourbano;
    }

    public void setIddistanciacascourbano(String iddistanciacascourbano) {
        this.iddistanciacascourbano = iddistanciacascourbano;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
