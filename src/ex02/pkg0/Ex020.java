/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02.pkg0;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Ex020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;
       Scanner leitor = new Scanner (System.in);     
       
       System.out.print("Digite a nota 1: ");
       nota1 = leitor.nextDouble () ;
       System.out.print("\nDigite a nota 2: ");
       nota2 = leitor.nextDouble () ;
       System.out.print("\nDigite a nota 3: ");
       nota3 = leitor.nextDouble () ;
       System.out.print("\nDigite a nota 4: ");
       nota4 = leitor.nextDouble () ;
       
       media = (nota1 + nota2 + nota3 + nota4) / 4;
       
       System.out.print("A média é " + media);
    }
    
}
