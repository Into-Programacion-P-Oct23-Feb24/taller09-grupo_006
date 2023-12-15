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
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        promedio = suma / arreglo.length;
        for (int m = 0; m < arreglo.length; m++) {
            if (arreglo[m] > promedio) {
                media_arriba++;
            } else {
                if (arreglo[m] < arreglo.length) {
                    media_abajo++;
                }
            }
        }
        System.out.printf("Promedio:%4f\n Numero por encima:%d\n Numeros por debajo:%d\n",
                promedio, media_arriba, media_abajo);

    }

}
