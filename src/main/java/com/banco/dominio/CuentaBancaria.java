package com.banco.dominio;

public class CuentaBancaria {
    private long numero;
    private String tipo;
    private long saldo;
    private long tope;
    private short clave;
    private Persona propietario;
    private boolean activa;

    public void activar() {
        this.activa = true;
    }

    public void cerrar() {
        this.activa = false;
    }

    public boolean retirar(long montoARetirar) {
        if (activa == true && saldo >= montoARetirar) {
            this.saldo -= montoARetirar; // same to-> this.saldo = this.saldo - montoARetirar;
            return true;
        } else {
            System.out.println("No se pudo retirar. La cuenta está inactiva o el saldo es insuficiente.");
            return false;
        }
    }

    public boolean consignar(long montoAConsignar) {
        if (activa == true) {
            this.saldo += montoAConsignar;
            return true;
        }

        System.out.println("No se pudo consignar. La cuenta está inactiva.");
        return false;
    }

    public boolean transferir(long montoATransferir, CuentaBancaria cuentaDestino) {
        // 1. sacar de la cuenta de origen
        boolean retiroBien = this.retirar(montoATransferir);

        // 2. adicionar a la cuenta destino
        if (retiroBien == true) {
            boolean consignoBien = cuentaDestino.consignar(montoATransferir);

            if (!consignoBien) {

            }

            return consignoBien;
        }

        return false;
    }

    public String obtenerSaldoActual() {
        return "Tienes " + this.saldo + " pesos.";
    }

    public long getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getTope() {
        return tope;
    }

    public short getClave() {
        return clave;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setTope(long tope) {
        this.tope = tope;
    }

    public void setClave(short clave) {
        this.clave = clave;
    }
}
