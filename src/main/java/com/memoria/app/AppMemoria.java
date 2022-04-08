package com.memoria.app;

import com.agenda.dominio.Contacto;

public class AppMemoria {
    public static void main(String[] args) {
        Contacto contactoGabriel = new Contacto("Gabriel", "Casas", 3006963222l);
        Contacto contactoAnna = contactoGabriel;

        System.out.println("ReferenciaGabriel: " + contactoGabriel.getNombre());
        System.out.println("ReferenciaAnna: " + contactoAnna.getNombre());
        System.out.println("ReferenciaGabriel: " + contactoGabriel.getApellido());
        System.out.println("ReferenciaAnna: " + contactoAnna.getApellido());

        contactoAnna.setNombre("Ruperto");
        contactoGabriel.setApellido("Mendoza");
        System.out.println("-------------- DESPUES DE CAMBIAR EL NOMBRE");
        System.out.println("ReferenciaGabriel: " + contactoGabriel.getNombre());
        System.out.println("ReferenciaAnna: " + contactoAnna.getNombre());
        System.out.println("ReferenciaGabriel: " + contactoGabriel.getApellido());
        System.out.println("ReferenciaAnna: " + contactoAnna.getApellido());

        contactoAnna = new Contacto("Anna", "Restrepo", 3205714551l);
        contactoAnna.setNombre("Anastasia");

        System.out.println("-------------- DESPUES DE CREAR OTRO OBJETO");
        System.out.println("ReferenciaGabriel: " + contactoGabriel.getNombre());
        System.out.println("ReferenciaAnna: " + contactoAnna.getNombre());
    }
}
