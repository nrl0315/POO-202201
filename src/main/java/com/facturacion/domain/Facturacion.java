package com.facturacion.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion(){
        facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, long valor, LocalDate fecha){
        Factura factura = null;
        if(fecha.isBefore(LocalDate.now())){
            factura = new FacturaVencida(valor, cliente, fecha);
        } else{
            if(valor >= 100000){
                factura = new FacturaConIVA(valor, cliente, (short) 19, fecha);
            } else {
                factura = new FacturaSinIVA(valor, cliente,fecha);
            }
        }


        facturas.add(factura);
    }

    public long getTotalFacturacion(){
        return facturas.stream().mapToLong(fac -> fac.calcularTotal()).sum();

    }

    public Factura getFacturaMasCara(){
        return facturas.Collections.max(facturas);

    }

    public List<FacturaSinIVA> getFacturasSinIVA(){
        List<FacturaSinIVA> facturasSinIVA = new ArrayList<>();

        for(Factura factura : this.facturas){
            if(factura instanceof FacturaSinIVA){
                facturasSinIVA.add((FacturaSinIVA)factura);
            }
        }
        return facturasSinIVA;
    }
}
