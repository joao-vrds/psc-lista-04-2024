/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_10;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1 = 0;
        int n2 = 0;
        
        System.out.println("Digite o 1° números: ");
        n1 = input.nextInt();
        System.out.println("Digite o 2° números: ");
        n2 = input.nextInt();
        
        int minimo = Math.min(n1, n2);
        int maximo = Math.max(n1, n2);
        
        System.out.print("\nEstes são os números entre " + minimo + " e " + maximo + ":\n");
        
        for( int i = minimo + 1; i > minimo && i < maximo; i++ ){
            System.out.println(i);
    }
        input.close();
    }
}
