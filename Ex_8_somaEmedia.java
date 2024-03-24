/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_8_somaemedia;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_8_somaEmedia
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int soma = 0, media = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = input.nextInt();
        }
        
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];    
        }
        
        media = soma / 5;
        
        System.out.println("A soma dos números digitados é " + soma + " e a média é " +  media);
        
        input.close();
    }
}
