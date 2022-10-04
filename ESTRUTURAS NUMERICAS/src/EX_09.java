/*09 - Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a 
temperatura em graus Celsius. C = 5 * ((F-32) / 9).*/

import java.util.Scanner;
public class EX_09
{
   public static void main(String args[]) {
        
        int f ;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a temperatura e Fahrenheit :  ");
                f = scan.nextInt();
        }
        
        System.out.println("Em Celsius ficaria :  "+(5 * ((f-32) / 9))+"c°");
            
        
   }
}