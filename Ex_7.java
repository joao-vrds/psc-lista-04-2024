/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_7;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }
        int maiorNumero = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        System.out.println("O maior número digitado é: " + maiorNumero);
        
        input.close();
    }
}
