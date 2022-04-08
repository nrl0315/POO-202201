package com.eps.app;
import com.eps.domain.EpsSistema;
import com.eps.domain.Persona;

public class AppEps {
    public static void main(String[] args) {
        EpsSistema EpsSistema = new EpsSistema();
        EpsSistema.agregarPaciente("Nicolas","Rendon",22,1001505948l,1,"Asma","La ceja");
        EpsSistema.agregarPaciente("Luisa","Agudelo",20,100254879l,0,"N/A","Medellin");
        EpsSistema.agregarEnfermedadPorDocumento(100254879l,"Covid");
    }
}
