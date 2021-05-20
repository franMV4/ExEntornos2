package com.SanValero;

public class Restaurante {


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }



    public Restaurante(String nombre, String direccion, String descripcion, String tipo, String horario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.horario = horario;
    }
    private String nombre;
    private String direccion;
    private String descripcion;
    private String tipo;
    private String horario;
}
