/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_5_populacao2;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_5_populacao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double cidadeA = 0, cidadeB = 0, anos = 0;
        boolean aux = true;
        double porcentagem1 = 0, porcentagem2;
        
        System.out.println("Digite a população da cidade A: ");
        cidadeA = input.nextDouble();
        System.out.println("Digite a população da cidade B: ");
        cidadeB = input.nextDouble();
        System.out.println("Digite o valor da porcentagem de crescimento da cidade A:");
        porcentagem1 = input.nextDouble();
        System.out.println("Digite o valor da porcentagem de crescimento da cidade B:");
        porcentagem2 = input.nextDouble();
        
        porcentagem1 = 1 + (porcentagem1 / 100);
        porcentagem2 = 1 + (porcentagem2 / 100);
        
        while (aux) {
            cidadeA = cidadeA * porcentagem1;
            cidadeB = cidadeB * porcentagem2;
            anos ++;
            if (cidadeA >= cidadeB)
            { System.out.println("São necessários " + anos + " anos para a cidade A empatar ou ultrapassar a cidade B");
              System.out.println("CidadeA = " + (int)cidadeA);
              System.out.println("CidadeB = " + (int)cidadeB);
            break;}
            
        }
        input.close();
    }
}
