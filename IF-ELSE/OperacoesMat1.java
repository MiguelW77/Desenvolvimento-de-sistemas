package program;

import java.util.Scanner;

public class Matematica1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        if (numero1 + numero2 > 100) {
            System.out.println("A soma é maior que 100");
        } else {
            System.out.println("A soma não é maior que 100");
        }
    }
}

