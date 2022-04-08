package com.snacksDispensador.domain;
public class Snack {
    private String nombre;
    private int cantidad;
    private int codigo;
    private String tipo;
    private int precio;

    public Snack(String nombre, int cantidad, int codigo, String tipo, int precio){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
