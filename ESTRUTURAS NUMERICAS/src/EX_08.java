/*08 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês
. Calcule e mostre o total do seu salário no referido mês.*/


import java.util.Scanner;
public class EX_08
{
   public static void main(String args[]) {
        
        float hora ;
        float valor_hora;
        float salario  ;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite quanto vc ganha por hora : ");
                hora = scan.nextFloat();
            System.out.print("Digite a quantidade de horas trabalhadas : ");
                valor_hora = scan.nextFloat();
        }
        
        salario = (hora*valor_hora);
       System.out.print("Nesse mes vc vai receber R$"+(salario));
        
   }
}