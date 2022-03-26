/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yosmeri;

import java.util.Scanner;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class Yosmeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            Scanner teclado = new Scanner (System.in);
       
        double  num1,num2;
            
     System.out.println("Ingresar dos numeros");
     System.out.println ("Ingresar un primer numero: ");
     num1=teclado.nextDouble ();
     System.out.println("Ingresar el segundo numero: ");
     num2=teclado.nextDouble ();
     
     System.out.println ("El entero mas cercano por arriba es: ");
     System.out.println(Math.ceil (num1));
     System.out.println("El entero mas cercano por debajo es: ");
     System.out.println(Math.floor (num2));
     
        
    }
    
}
