/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            // Se pide datos por pantalla
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            
            // la variable inicial tomala primera inicial de su cadena
            inicial = inicial.substring(0, 1);
            /*
                La estructura repetitiva fue creada con el objetivo de hacer que
                en la linea 50 el arreglo estudiantes tome la inicial de la posicion 0,
                hasta la posicion 6, para luego ser convertido en tipo cadena
                esto debido a que la palabra reservada "equals" solo funciona
                para comparar cadenas con cadenas.
            */            
            for (int i = 0; i < estudiantes.length; i++) {
                // En este caso la condicional identifica que la cadena ingresada
                // por el usuario no comienze por ninguna inicial de las cadenas 
                // que se encuentran en el arreglo estudiantes 
                if (inicial.equals(String.valueOf(estudiantes[i].charAt(0)))) {
                    bandera = false;
                }

            }
        }

    }

}
