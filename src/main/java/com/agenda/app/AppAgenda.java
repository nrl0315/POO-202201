package com.agenda.app;

import com.agenda.dominio.Agenda;
import com.agenda.dominio.Contacto;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        //     Stack-------Heap

        agenda.agregar("Georgina", "Ronaldo", 3113776458l);
        agenda.agregar("Ana", "Bedoya", 3219000174l);
        agenda.agregar("Berenice", "Zuluaga", 3219316174l);
        agenda.agregar("Carlos", "Mattos", 3002587496l);
        agenda.agregar("Carlos", "Maderos", 3022587496l);
        agenda.agregar("Alejandro", "Ramirez", 3104698710l);
        agenda.agregar("Nicolas", "Rendon", 31046986689l);

        Contacto c = agenda.buscarPorCelularConFilter(3104698710l);

        if (c != null) {
            System.out.println("Contacto buscado: " + c.getNombre());
        } else {
            System.out.println("Contacto no encontrado");
        }

        Contacto d = agenda.buscarPorNombre("Carlos");
        if(d != null){
            System.out.println("El contacto buscado es: " + d.getNombre() + " " + d.getApellido() + " " + d.getCelular());
        } else {
            System.out.println("Contacto no encontrado");
        }

        Contacto a = agenda.buscarPorApellido("Rendon");
        if(a != null){
            System.out.println("El contacto buscado es: " + a.getNombre() + " " + a.getApellido() + " " + a.getCelular());
        } else {
            System.out.println("Contacto no encontrado");
        }

        agenda.editar(31046986689l, 3174803759l);

        System.out.println("----- CONTACTOS ORDENADOS ----- ");
        agenda.ordenarAlfabeticamente();
    }
}
