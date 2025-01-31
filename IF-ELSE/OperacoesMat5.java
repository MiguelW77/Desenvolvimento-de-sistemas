package program;

import java.util.Scanner;

public class Matematica5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        int raizQuadrada = (int) Math.sqrt(numero);
        if (raizQuadrada * raizQuadrada == numero) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " não é um quadrado perfeito.");
        }

        scan.close();
    }
}
