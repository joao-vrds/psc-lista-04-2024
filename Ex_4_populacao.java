/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_4_populacao;

/**
 *
 * @author Jovro
 */

public class Ex_4_populacao {

    public static void main(String[] args) {
        
        double cidadeA = 80000, cidadeB = 200000, anos = 0;
        boolean aux = true;
        
        while (aux) {
            cidadeA = cidadeA * 1.03;
            cidadeB = cidadeB * 1.015;
            anos ++;
            if (cidadeA >= cidadeB)
            { System.out.println("São necessários " + anos + " anos para a cidade A empatar ou ultrapassar a cidade B");
              System.out.println("CidadeA = " + (int)cidadeA);
              System.out.println("CidadeB = " + (int)cidadeB);
            break;}
            
        }
        
    }
}
