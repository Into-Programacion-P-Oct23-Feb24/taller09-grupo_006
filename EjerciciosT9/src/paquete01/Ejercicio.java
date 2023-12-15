/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Se declaran las variables
        String[] marcasCarros;
        String marca;
        String acumulador = "";
        String caracter;
        int numero;
        int contador = 0;

        // Se pide por pantalla el numero de elementos que tendra el acumulador
        System.out.println("Ingrese el numero de marcas que se desee ingresar");
        numero = entrada.nextInt();

        entrada.nextLine();
        
        // En esta linea de codigo se asigna en numero de elementos, 
        // anteriormente ingresados por el usuario al arreglo tipo cadena
        marcasCarros = new String[numero];

        // La estructura repetitiva permite ingresar el nombre de las marcas
        while (contador < numero) {
            // Se pide por pantalla una marca de un automovil
            System.out.println("Ingrese un nombre de una marca de carro");
            marca = entrada.nextLine();
            
            // En esta siguiente linea de codigo la variable "caracter" 
            // guarda el primer caracter de la cadena que tiene la vairable marca
            caracter = marca.substring(0, 1);

            // La condicional se encarga de identificar si la marca comienza con A, C, T
            if (caracter.equals("A") || caracter.equals("C")
                    || caracter.equals("T")) {
            } else {
                // Si la condicional termina siendo falsa, entonces se guardara
                // la cadena ingresada por el usuario en la posicion del arreglo
                marcasCarros[contador] = marca;
                contador = contador + 1;
            }

        }

        // Esta estrctura repetitiva se encarga de acumular los nombres de los variables, 
        // guardandolos en el acumulador
        for (int i = 0; i < marcasCarros.length; i++) {
            acumulador = String.format("%s\n%s", acumulador,
                     marcasCarros[i]);
        }

        // Se presenta por pantalla los datos guardados en el acumulador
        System.out.printf("Los nombres de las marcas de los vehículos "
                + "ingresados son los siguientes: %s\n", acumulador);

    }

}
