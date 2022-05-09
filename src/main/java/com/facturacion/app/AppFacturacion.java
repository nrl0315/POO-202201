package com.facturacion.app;

import com.facturacion.domain.FacturaSinIVA;
import com.facturacion.domain.Facturacion;

import java.time.LocalDate;

public class AppFacturacion {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Nicolas",120000, LocalDate.of(2022,11,5));
        facturacion.generarFactura("Lina", 29000,LocalDate.of(2022,05,9));
        facturacion.generarFactura("isabella", 89000,LocalDate.of(2022, 9,15));

        System.out.println(facturacion.getTotalFacturacion());
        facturacion.getFacturasSinIVA().forEach(c -> System.out.println(c.getCliente()));
    }
}
