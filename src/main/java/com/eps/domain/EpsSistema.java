package com.eps.domain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.eps.domain.Persona;

public class EpsSistema {
    private List<Persona> Personas;
    public EpsSistema(){
        this.Personas = new ArrayList<>();
    }

    public void agregarPaciente(String nombre, String apellido, int edad, long documento, int numeroEnfemedades, String enfermedades, String ciudad){
        Persona personaAgregar = new Persona (nombre,apellido,edad,documento,numeroEnfemedades,enfermedades,ciudad);
        System.out.println("Se ha agregado correctamente al paciente " + nombre + " con el numero de documento " + documento + " correctamente");
        this.Personas.add(personaAgregar);
    }

    public void agregarEnfermedadPorDocumento(long documento, String enfermedades){
        Persona personaBuscar = this.Personas.stream().filter(persona -> persona.getDocumento() == documento).findFirst().get();
        personaBuscar.setEnfermedades(enfermedades);
        personaBuscar.setNumeroEnfermedades(personaBuscar.getNumeroEnfermedades() + 1);
        System.out.println("Se ha registrado correctamente la enfermedad " + enfermedades + " en el paciente " + personaBuscar.getNombre());
    }


}
