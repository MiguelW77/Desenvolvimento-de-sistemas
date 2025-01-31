package program;

import java.util.Scanner;

public class DecisoesFinanceiras3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();

        if (salario >= 3000) {
            System.out.println("Você pode financiar um imóvel!");
        }
        else {
            System.out.println("Você não pode financiar um imóvel!");
        }
    }
}
