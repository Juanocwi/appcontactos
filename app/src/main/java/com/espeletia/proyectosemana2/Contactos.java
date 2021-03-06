package com.espeletia.proyectosemana2;

public class Contactos {
    private String nombre;
    private String fecha;
    private String telefono;
    private String correo;
    private String descripcion;

    public Contactos(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = email;
    }

    public Contactos(String nombre, String fecha, String telefono, String email, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = email;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return correo;
    }

    public void setEmail(String email) {
        this.correo = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
