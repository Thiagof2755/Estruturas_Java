/*04 - Faça um Programa que peça as 4 notas bimestrais e mostre a média*/

import java.util.Scanner;
public class EX_04
{
   public static void main(String args[]) {
        
        int x = 0 ;
        float nota = 0 ;
        float total = 0 ;
        int Bimestre = 1 ;
        
        try (Scanner scan = new Scanner(System.in)) {
            while (x<4){
            
            System.out.print("Digite a nota do " + Bimestre + "º Bimestre : " );
                nota = scan.nextInt();
                    total =total + nota;
                        x++;Bimestre++;
            
            }
        }
        
        System.out.println("A media é : "+(total/x));
        
   }
}

