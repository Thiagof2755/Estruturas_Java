/*11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.  */

import java.util.Scanner;
public class EX_11
{
   public static void main(String args[]) {
        
        int a ;
        int b ; 
        float c ;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero inteiro :  ");
                a = scan.nextInt();
            System.out.print("Digite o segundo numero inteiro :  ");
                b = scan.nextInt();
            System.out.print("Digite o terceiro numero real:  ");
                c = scan.nextFloat();
        }
        
        System.out.println("O produto do dobro do primeiro com metade do segundo é : "+((a*2)+(b/2)))  ;
        System.out.println("a soma do triplo do primeiro com o terceiro é :  "+((a*3)+c)) ;
        System.out.println("O terceiro elevado ao cubo."+(c*c*c)) ;
   }
}