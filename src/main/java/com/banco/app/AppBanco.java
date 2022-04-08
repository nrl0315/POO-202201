package com.banco.app;

import com.banco.dominio.CuentaBancaria;
import com.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria tuCuenta = new CuentaBancaria();

        miCuenta.activar();
        miCuenta.consignar(300000);
        miCuenta.retirar(98000);

        System.out.println("MI CUENTA: " + miCuenta.obtenerSaldoActual());
        System.out.println("TU CUENTA: " + tuCuenta.obtenerSaldoActual());
    }
}
