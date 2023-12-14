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
        for (int i = 0; i < promediosCualitativos.length; i++) {
               acumulador = String.format("%s%s promedio: %f promedio cualitativo %s\n",acumulador
                       , estudiantes[i], promedios[i],promediosCualitativos[i]);
            }
        System.out.printf("%s",acumulador);

    }
}
