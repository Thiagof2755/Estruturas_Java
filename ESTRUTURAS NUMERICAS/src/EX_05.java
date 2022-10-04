/*05 - Faça um Programa que converta metros para centímetros.*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class EX_05
{
   public static void main(String args[]) {
        
        float x ;

        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite os metros : ");
                x= scan.nextFloat();
        }
        
        System.out.print("Em centrimetros é : "+( new DecimalFormat("#,##0").format(x*100) )+"cm");
        
   }
}


