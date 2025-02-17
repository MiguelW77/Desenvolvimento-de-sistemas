/* Exercício referente ao problema 1 de "Básicos" */

package program.Java;
import java.util.Scanner;
public class IfElseOOP5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para verificação de positivo ou negativo:");
        int x = scan.nextInt();
        int result = x;
        showResult(result);


    }

    static int showResult(int x) {
        if (x > 0) {
            System.out.println("Numero positivo!");
        } else {
            System.out.println("Numero negativo!");
        }
        return x;

    }
}
