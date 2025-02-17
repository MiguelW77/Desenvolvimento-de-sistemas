package Ternaria;

import java.util.Scanner;

public class Ternaria11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0)
                ? (numero >= 0 ? "Par e Positivo" : "Par e Negativo")
                : (numero >= 0 ? "Ímpar e Positivo" : "Ímpar e Negativo");

        System.out.println("O número é: " + resultado);

        scanner.close();

    }
}
