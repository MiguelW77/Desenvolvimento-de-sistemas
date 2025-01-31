package program;

import java.util.Scanner;

public class Básicos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para verificação ímpar ou par:");
        int x = scan.nextInt();

        if (x % 2 == 0)
        {
            System.out.println("Nmúero par.");

        } else if (x % 1 == 0) {
            System.out.println("Número ímpar");

        }
    }
}
