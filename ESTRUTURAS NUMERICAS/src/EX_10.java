/*10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.*/

import java.util.Scanner;
public class EX_10
{
   public static void main(String args[]) {
        
        int c ;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a temperatura e Celsius:  ");
                c = scan.nextInt();
        }
        
        System.out.println("Em fahrenheit ficaria :  "+((c* 9/5) + 32 )+"c°");
            
        
   }
}

