package com.example.lab9_20197122.Beans;

public class Licencia {
    private String idLicencia;
    private String categoria;
    private String frecha_emision;
    private String fecha_caducidad;
    private Pais pais;

    public String getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(String idLicencia) {
        this.idLicencia = idLicencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFrecha_emision() {
        return frecha_emision;
    }

    public void setFrecha_emision(String frecha_emision) {
        this.frecha_emision = frecha_emision;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
