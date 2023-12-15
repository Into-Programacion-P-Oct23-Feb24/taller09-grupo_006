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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        String acumulador = "";

        // La estructura repetitiva for, se repite para comparar todos los valores
        // del arreglo y poder asignar en otro arreglo, el promedio Cualitativo
        for (int i = 0; i < estudiantes.length; i++) {
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Regular";
            } else {
                if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                    promediosCualitativos[i] = "Bueno";
                } else {
                    promediosCualitativos[i] = "Sobresaliente";
                }
            }
            
        }
        // El for asigna valores tipo cadena al acumulador
        for (int i = 0; i < promediosCualitativos.length; i++) {
               acumulador = String.format("%s%s promedio: %.2f "
                       + "promedio cualitativo %s\n",acumulador
                       , estudiantes[i], promedios[i],promediosCualitativos[i]);
            }
        
        // Se presenta por pantalla el resultado de acumulador
        System.out.printf("%s",acumulador);

    }
}
