package com.snacksDispensador.app;
import com.snacksDispensador.domain.Snack;
import com.snacksDispensador.domain.SnacksDispensador;

public class AppSnacksDispensador {
    public static void main(String[] args) {
        SnacksDispensador snacksDispensador = new SnacksDispensador();
        snacksDispensador.agregarDeCero("Coca cola", 3,1,"Gaseosa", 2500);
        snacksDispensador.agregarDeCero("Pepsi", 5,2,"Gaseosa", 2500);
        snacksDispensador.agregarDeCero("Choclitos", 5, 3, "Mecato", 1800);
        snacksDispensador.agregarDeCero("Chocolatina",0,4,"Mecato",500);
        snacksDispensador.agregarDeCero("Gomitas", 0, 5,"Mecato",200);
        snacksDispensador.agregarDeCero("Papitas de limon", 4,6,"Mecato", 1500);
        snacksDispensador.agregarDeCero("Mani", 6, 7,"Frutos secos", 800);
        snacksDispensador.agregarDeCero("Detodito", 0, 8,"Mecato",1700);
        snacksDispensador.agregarExistenteNombre("Coca cola", 2);
        snacksDispensador.agregarExistenteNombre("Pepsi", 1);
        snacksDispensador.sacarSnackCodigo(01,3);
        snacksDispensador.sacarSnackCodigo(02,3);
        snacksDispensador.sacarSnackNombre("Coca cola", 1);
        snacksDispensador.sacarSnackNombre("Gomitas", 2);
        snacksDispensador.agregarExistenteCodigo(01,5);
        snacksDispensador.eliminarSnack(02);
        snacksDispensador.mostrarCantidad(03);
        snacksDispensador.snacksAgotados();
        snacksDispensador.imprimirInventario();
        snacksDispensador.ordenarMayorMenor();
        snacksDispensador.ordenarMenorMayor();
    }

}
