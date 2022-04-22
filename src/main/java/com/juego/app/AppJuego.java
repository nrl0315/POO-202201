package com.juego.app;

import com.juego.domain.Juego;

import javax.swing.*;
import java.util.Arrays;

public class AppJuego {
    static ImageIcon icono = new ImageIcon(AppJuego.class.getResource("/imagenes/iconojuego.png"));
    private static final int COMENZAR_JUEGO = 0;
    private static final int VER_PUNTAJE = 1;
    private static final int INSTRUCCIONES = 2;
    private static final int INTRODUCIR_NOMBRE = 3;

    public static void main(String[] args) {
        Juego Juego = new Juego("Marvel game");

        while(true){
            int opcion = JOptionPane.showOptionDialog(null,"IRONMAN,CAPITAN AMERICA,THOR","Juego Marvel",0,0,icono,
                    Arrays.asList("Jugar", "Mostrar puntaje", "Instrucciones del juego", "Cambiar de jugador").toArray(),null);

            switch(opcion){
                case COMENZAR_JUEGO:
                    if(Juego.getJugador() == null){
                        Juego.setJugador(IngresarJugador());
                    }
                    JOptionPane.showInputDialog(null,"Estás preparado para jugar " + Juego.getJugador() + " ?");
                    int jugadaMaquina = Juego.jugadaMaquina();
                    int jugadaJugador = JOptionPane.showOptionDialog(null,"Piensa bien y selecciona el personaje","Juego Marvel",0,
                            JOptionPane.QUESTION_MESSAGE,icono,Arrays.asList("Iron man", "Capitan america", "Thor").toArray(),null);
                    JOptionPane.showMessageDialog(null,Juego.getJugador()+ "Creiste en: \n"+
                            Jugada(jugadaJugador) + "\n" + "La maquina selecionó: \n" + Jugada(Juego.jugadaMaquina()));
                    String MostrarResultado = Juego.jugar(jugadaJugador,jugadaMaquina);
                    JOptionPane.showMessageDialog(null,MostrarResultado);
                    break;

                case VER_PUNTAJE:
                    if(Juego.getJugador() == null){
                        Juego.setJugador(IngresarJugador());
                    }
                    JOptionPane.showMessageDialog(null,"¡PUNTAJES! \n " + Juego.getJugador()+": " + Juego.getPartidasGanadas()
                            + "\n Pc: " + Juego.getPartidasGanadasMaquina() + "\n Empates: " + Juego.getEmpate());
                    break;

                case INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null,"INSTRUCCIONES\n\n este nuevo juego es bastante facil de comprender si eres fan de marvel, " +
                            "todos conocemos los peronajes más relevantes de la serie. \n en este juego que hemos inventado para POO solo tenemos que ver la jerarquia de los 3 personajes indicados: \n " +
                            " 1. Tony Stark siempre ha sido mejor que el Capitan America y todos lo sabemos, entonces lo destruye aunque en las películas no pase :c" +
                            "  \n 2. EL Capitan America es una persona con experiencia por todo el tiempo que ha estado en la tierra, por lo tanto derrota a Thor en su momento de ebriedad" +
                            "\n 3." + "Thor luego de pasar por su momento de ebriedad y reincorporarse con su martillo vence a Iron man \n  " +
                            "En caso de que la maquina y el jugador escojan el mismo super heroe habrá un empate puesto que cuentan con las mismas cualidades " +
                            "por lo tanto debemos seguir jugando hasta que alguien le parta la madre al otro ");
                    break;

                case INTRODUCIR_NOMBRE:
                    Juego.setJugador(IngresarJugador());
                    Juego.setPartidasGanadas(0);
                    Juego.setPartidasGanadasMaquina(0);
                    Juego.setEmpate(0);
                    break;

                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
    }

    public static String IngresarJugador(){
        String nombreJugador;

        do {
            nombreJugador = JOptionPane.showInputDialog(null,"Ingrese el nombre del jugador: ");
        }while(nombreJugador == null || nombreJugador.trim().isEmpty());
        return nombreJugador;
    }

    public static String Jugada(int jugada){
        if(jugada == 0){
            return "IRON MAN";
        }else if (jugada == 1){
            return "CAPITAN AMERICA";
        }else{
            return "THOR";
        }
    }
}




