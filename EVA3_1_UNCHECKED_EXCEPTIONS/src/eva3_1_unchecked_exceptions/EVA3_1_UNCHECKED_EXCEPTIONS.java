/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author galle
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ARITHMETIC EXCEPTION (division entre cero
        System.out.println(" Inicia el programa");
        int x=5, y = 0;
        System.out.println("Inicia las variables");
         int resu = x / y;
         System.out.println("Calculando la diviaion");
         System.out.println("Division: "+ resu); 
       
        // MISMATCH EXCEPTION
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un numero:");
        int nume = input.nextInt();
        System.out.println("Tu numero es: "+nume); 
        
        
        // INDEX OUT OF BOUNDS
        int [] arreglo = new int[5]; 
        arreglo [0] = 100;
        arreglo [1] = 200;
        arreglo [2] = 300;
        arreglo [3] = 400;
        arreglo [4] = 500;
        arreglo [5] = 600; 
        
        // NULLPOINTER EXCEPTION
       Prueba obj = null;
        System.out.println("Valor de x: "+ obj.x);
       
    }
 
}

class Prueba{
    public int x=100;
}