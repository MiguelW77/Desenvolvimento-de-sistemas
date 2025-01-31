package program;

import java.util.Scanner;

public class DecisoesFinanceiras4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();

        System.out.println("Digite o valor das parcelas: ");
        double parcelas = scan.nextDouble();

        if (parcelas >= salario * 0.10) {
            System.out.println("Você pode pagar pelo produto em parcelas!");
        } else {
            System.out.println("Você não pode pagar pelo produto em parcelas!");
        }
        scan.close();
    }
}
