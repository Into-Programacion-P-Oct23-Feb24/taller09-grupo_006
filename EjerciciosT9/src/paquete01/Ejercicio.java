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
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Variables
        boolean bandera = true;
        String[] nombreCarros;
        int numero;
        int contador = 0;
        String marca;
        String acumulador = "";
        String caracter = null;
        
        // Se pide por pantalla el numero de elementos que tendra el acumulador
        System.out.println("Ingrese el numero de marcas que se desee ingresar");
        numero = entrada.nextInt();
        
        entrada.nextLine();
        
        nombreCarros = new String [numero];
       
        // La estructura repetitiva permite ingresar el nombre de las marcas
        while(contador < numero){
            System.out.println("Ingrese un nombre de una marca de carro");
            marca = entrada.nextLine();
            
            caracter = marca.substring(0,1);
            
            // La condicional se encarga de identificar si la marca comienza con A, C, T
            if(caracter.equals("A") || caracter.equals("C")
                    || caracter.equals("T")){
            }else{
                nombreCarros[contador] = marca;
                contador = contador + 1;

            }
            
        }
        
        // Esta estrctura repetitiva se encarga de acumular los nombres de los variables
        for(int i =0; i<nombreCarros.length;i++){
            acumulador = String.format("%s\n%s", acumulador
                        , nombreCarros[i]);
        }
        
        // Se presenta por pantalla los datos guardados en el acumulador
        System.out.printf("%s\n",acumulador);
       
    }
    
}
