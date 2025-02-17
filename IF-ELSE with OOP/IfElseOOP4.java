/* Exercício referente ao problema 2 de "Datas e Horários" */

package program.Java;
import java.util.Scanner;
public class IfElseOOP4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o mês (1-12): ");
        int mes = scan.nextInt();
        int resultado = mes;
        VerifcMes(resultado);
    }
    public static int VerifcMes(int mes){
        if (mes >= 1 && mes <= 12) {
            System.out.println("Mês válido.");
        } else {
            System.out.println("Mês inválido.");
        }
        return mes;
    }
}



