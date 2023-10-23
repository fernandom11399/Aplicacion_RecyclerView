package com.example.aplicacion_recyclerview.models;

public class Persona extends Habilidades {
    private String Nombre;
    private String Genero;
    private Ocupacion Ocupacion;

    private String Poder;

    public Persona(String nombre, String genero, String poder, com.example.aplicacion_recyclerview.models.Ocupacion ocupacion) {
        Nombre = nombre;
        Genero = genero;
        Poder = poder;
        Ocupacion = ocupacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getPoder() {
        return Poder;
    }

    public void setPoder(String poder) {
        Poder = poder;
    }

    public com.example.aplicacion_recyclerview.models.Ocupacion getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(com.example.aplicacion_recyclerview.models.Ocupacion ocupacion) {
        Ocupacion = ocupacion;
    }
}
