/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0;
        double promedio;
        int media_arriba = 0;
        int media_abajo = 0;
        
        // Esta estructura repetitiva se encarga de sumar todos los valores del
        // arreglo
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        
        // Se saca el promedio
        promedio = suma / arreglo.length;
         
        for (int m = 0; m < arreglo.length; m++) {
            // Este condicional cuenta el numero de elementos que estan arriba 
            // de la media aritmetica
            if (arreglo[m] > promedio) {
                media_arriba++;
            } else {
                // Este condicional cuenta el numero de elementos que estan por 
                // debajo de la media aritmetica
                if (arreglo[m] < arreglo.length) {
                    media_abajo++;
                }
            }
        }
        
        // Se presentan los datos
        System.out.printf("Promedio: %.2f\n"
                + "Numero de elementos superiores al promedio: %d\n"
                + "Numeros de elementos inferiores al promedio promedio: %d\n",
                promedio, media_arriba, media_abajo);

    }

}
