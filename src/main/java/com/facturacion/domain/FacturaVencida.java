package com.facturacion.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{
    public static final int VALOR_DIA_VENCIDO = 10000;

    public FacturaVencida(long valor, String cliente, LocalDate fechaDeVencimiento) {
        super(valor, cliente, fechaDeVencimiento);
    }

    @Override
    public long calcularTotal() {
         LocalDate fechaActual = LocalDate.now();
        long diasVencimiento = getFechaDeVencimiento().until(fechaActual, ChronoUnit.DAYS
        return (int) (VALOR_DIA_VENCIDO * diasVencimiento);
    }

    public int getDiasVencidos(){
        LocalDate fechaActual = LocalDate.now();
        long diasVencimiento = getFechaDeVencimiento().until(fechaActual, ChronoUnit.DAYS);
        return diasVencimiento;
    }
}
