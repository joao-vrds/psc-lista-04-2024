/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_1_0ao10;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;

public class Ex_1_0ao10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota = 0;

        while (true) {
            System.out.println("Digite uma nota de 1 a 10: ");
            nota = input.nextInt();
            
            if (nota >= 0 && nota <= 10) {
            break;
            }
            else{
            System.out.print("Valor inválido tente novamente.\n");
            }
            input.close();
        }
    }
}
