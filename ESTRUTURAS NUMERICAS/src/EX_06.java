/*06 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área */


import java.util.Scanner;
public class EX_06
{
   public static void main(String args[]) {
        
        float x ;
        double area;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o raio : ");
                x= scan.nextFloat();
        }
        
        area = (3.14*(x*x));
       System.out.print("A area é : "+area);
        
   }
}

