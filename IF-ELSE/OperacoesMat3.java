package program;

import java.util.Scanner;

public class Matematica3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println(numero1 + " é divisível por " + numero2);
        } else if (numero2 == 0) {
            System.out.println("Não é possível dividir por zero");
        } else {
            System.out.println(numero1 + " não é divisível por " + numero2);
        }
    }
}
