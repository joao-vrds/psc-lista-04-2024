/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_3;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
public class Ex_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = null;
        int age = 0;
        double wage = 0;
        char gender = ' ';
        char statusSG = ' ';
        String status = null;
        boolean aux = true;
        
        while(true){
        System.out.print("Digite seu nome: ");
        name = input.nextLine();
        if(name.length() <= 3)
        System.out.print("Nome inválido.\n" );
        else break; 
        }
        
        while (true){
            System.out.print("Digite a idade: ");
            age = input.nextInt();
            
            if( age > 0 && age <= 150 )
            { break; }
            else
            { System.out.print("Idade inválida.\n");}
        }
        
        while (true){
            System.out.print("Digite o salário: ");
            wage = input.nextDouble();
            
            if( wage > 0 )
            { break; }
            else{ System.out.print("Valor inválido.\n"); }
        }
        
        while (true){
            System.out.print("Escolha o gênero F ou M: ");
            gender = input.next().charAt(0); 
            
            if ( gender == 'F' || gender == 'M')
            { break; }
            else
            { System.out.print("Opção inváçida.\n");} 
        }
        
        while (aux){
            System.out.println("Escolha o estado civil:\n(S)\n(C)\n(V)\n(D) ");
            statusSG = input.next().charAt(0);
            
            switch(statusSG){
                case 'S' :
                    status = "Solteiro(a)";
                    aux = false;
                    break;
                case 'C' :
                    status = "Casado(a)";
                    aux = false;
                    break;
                case 'V' :
                    status = "Viúvo(a)";
                    aux = false;
                    break;
                case 'D' :
                    status = "Divorciado(a)";
                    aux = false;
                    break;
                default :
                    System.out.print("Opção inválida.\n");    
            }
        }
        System.out.println("Seu nome é: \t\t" + name);
        System.out.println("Você tem: \t\t" + age + " anos");
        System.out.println("Seu salário é : \tR$" + wage);
        System.out.println("Seu gênero é: \t\t" + gender);
        System.out.println("Seu estado civil é: \t" + status);
    }
}
