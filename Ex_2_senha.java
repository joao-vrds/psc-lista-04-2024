/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_2_senha;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_2_senha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String usuario = null;
        String senha = null;
        
        while(true)
        {
        System.out.print("Digite o nome do usuário:\t" );
        usuario = input.nextLine();
        System.out.print("\nDigite a sua senha:\t\t");
        senha = input.nextLine();
        
        if ( senha != usuario )
        { break; }
        else{System.out.print("Dados inválidos.\n");}
        
        }
        
    }
}
