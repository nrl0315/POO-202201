package com.facturacion.domain;

import java.time.LocalDate;

public class FacturaConIVA extends Factura{
    private short valorIva;

    public FacturaConIVA(long valor, String cliente, short valorIva, LocalDate fechaDeVencimiento) {
        super(valor, cliente,fechaDeVencimiento);
        this.valorIva = valorIva;
    }

    public long calcularIva(){
        return this.getValor() * this.valorIva / 100;
    }

    @Override
    public long calcularTotal() {
        return this.calcularIva() + this.getValor();
    }
}
