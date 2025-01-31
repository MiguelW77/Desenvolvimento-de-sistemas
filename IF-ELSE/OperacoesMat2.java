package program;

import java.util.Scanner;

public class Matematica2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scan.nextInt();

        if (numero1 - numero2 < 0) {
            System.out.println("A diferença é negativa");
        } else {
            System.out.println("A diferença é positiva ou nula");
        }
    }
}

