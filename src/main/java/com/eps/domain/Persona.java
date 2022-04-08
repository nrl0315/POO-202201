package com.eps.domain;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private int numeroEnfermedades;
    private String enfermedades;
    private String ciudad;

    public Persona(String nombre, String apellido, int edad, long documento, int numeroEnfermedades, String enfermedades, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.numeroEnfermedades = numeroEnfermedades;
        this.enfermedades = enfermedades;
        this.ciudad = ciudad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getNumeroEnfermedades() {
        return numeroEnfermedades;
    }

    public void setNumeroEnfermedades(int numeroEnfermedades) {
        this.numeroEnfermedades = numeroEnfermedades;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
