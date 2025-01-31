package program;

import java.util.Scanner;

public class Básicos1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ;
        int x;

        System.out.println("Digite um número para verificação positivo ou negativo:");
        x = scan.nextInt();
        if (x < 0)
        {
            System.out.println("Número negativo.");
        }

        if (x > 0)
        {
            System.out.println("Número positivo.");

        }
    }
}
