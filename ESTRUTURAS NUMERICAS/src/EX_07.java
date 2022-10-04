/*07 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.*/


import java.util.Scanner;
public class EX_07
{
   public static void main(String args[]) {
        
        float base ;
        float altura;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a altura do quadrado : ");
                altura = scan.nextFloat();
            System.out.print("Digite a base do quadrado : ");
                base = scan.nextFloat();
        }
        
        float area = (base*altura);
       System.out.println("A area é : "+area);
       System.out.println("O dobro da area é : "+(area*2));
        
   }
}