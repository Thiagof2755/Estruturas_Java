
/*02- Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].*/

import java.util.Scanner;
public class EX_02
{
   public static void main(String args[]) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int x;
  
            System.out.print("Digite um Numero : ");
            x = scan.nextInt();
            System.out.println("Numero digitado foi : "+ x);
        }
    }
	
}