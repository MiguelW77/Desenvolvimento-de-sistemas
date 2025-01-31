package program;
import java.util.Scanner;
public class SituacoesCotidianas4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.print("Digite seu peso (em kg): ");
        double peso = scan.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você está apto a doar sangue.");
        } else {
            System.out.println("Você não está apto a doar sangue.");
        }
    }
}
