package com.facturacion.domain;

import java.time.LocalDate;

public abstract class Factura {
    private long valor;
    private String cliente;
    private LocalDate fechaDeVencimiento;

    public Factura(long valor, String cliente, LocalDate fechaDeVencimiento) {
        this.valor = valor;
        this.cliente = cliente;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public abstract long calcularTotal();

    public long getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
