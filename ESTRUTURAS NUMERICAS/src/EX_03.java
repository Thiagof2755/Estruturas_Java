
/*03 - Faça um Programa que peça dois números e imprima a soma.*/

import java.util.Scanner;
public class EX_03
{
   public static void main(String args[]) {
        
        int x;
        int y; 
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o primeiro Numero : ");
            x = scan.nextInt();
            System.out.print("Digite o segundo  Numero : ");
            y = scan.nextInt();
        }
        
        System.out.println("A soma foi : "+ (x+y));
    }
	
}

