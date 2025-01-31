package program;

import java.util.Scanner;

public class DecisoesFinanceiras1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double saldo = scan.nextDouble();

        if (saldo <= 0) {
            System.out.println("Você não tem dinheiro suficiente");
        }
        else {
            System.out.println("Você pode fazer um saque");
        }
    }
}
