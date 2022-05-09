package com.facturacion.domain;

import java.time.LocalDate;

public class FacturaSinIVA extends Factura{

    public FacturaSinIVA(long valor, String cliente, LocalDate fechaDeVencimiento) {
        super(valor, cliente, fechaDeVencimiento);
    }

    @Override
    public long calcularTotal() {
        return this.getValor();
    }
}
