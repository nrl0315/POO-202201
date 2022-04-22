package com.juego.domain;

import java.util.Arrays;
import java.util.List;

public class Juego {
    private String jugador;
    private int partidasGanadas;
    private int partidasGanadasMaquina;
    private int empate;
    private String nombreJuego;

    public static final int IRON_MAN = 0;
    public static final int CAPITAN_AMERICA = 1;
    public static final int THOR = 2;
    public static final List<Integer> OPCION = Arrays.asList(IRON_MAN, CAPITAN_AMERICA, THOR);

    public Juego(String numeroJuego){
        this.nombreJuego = numeroJuego;
    }

    public int jugadaMaquina(){
        int tiroMaquina = (int)(Math.random() * 2 + 1);
        return tiroMaquina;
    }

    public String jugar(int tiroJugador, int jugadaMaquina){
        if(tiroJugador == IRON_MAN && jugadaMaquina == CAPITAN_AMERICA){
            partidasGanadas++;
            return "Mero crack bro";
        } else if(tiroJugador == CAPITAN_AMERICA && jugadaMaquina == THOR){
            partidasGanadas++;
            return "Mero crack bro";
        } else if(tiroJugador == THOR && jugadaMaquina == IRON_MAN){
            partidasGanadas++;
            return "Mero crack bro";
        } else if(tiroJugador == jugadaMaquina){
            empate++;
            return "La partida quedó empatada";
        } else{
            partidasGanadasMaquina++;
            return "Paila bro te ganó la maquina";
        }
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasGanadasMaquina() {
        return partidasGanadasMaquina;
    }

    public void setPartidasGanadasMaquina(int partidasGanadasMaquina) {
        this.partidasGanadasMaquina = partidasGanadasMaquina;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
