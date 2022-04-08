package com.calculadora.app;

import javax.swing.*;

public class AppCalculadora {

    public static void main(String[] args) {

        int opcion = 0;
        double num1, num2, resultado;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Calucladora - POO" + "\n"+ "1. Sumar"
        + "\n" + "2. Restar" + "\n" + "3. Dividir" + "\n" + "4. Multiplicar"
        + "\n" + "5. Salir"));

        switch (opcion) {
            case 1:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: " + resultado);
                break;
            case 2:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta de los numeros ingresados es: " + resultado);
                break;

            case 3:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "La division de los numeros ingresados es: " + resultado);
                break;

            case 4:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicacion de los numeros ingresados es: " + resultado);
                break;
        }

    }
}
