package program;

import java.util.Scanner;

public class CategoriasEClassificacoes5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        int temperatura = scan.nextInt();

        if (temperatura <= 20) {
            System.out.println("A temperatura está fria!");
        }
        else if (temperatura <= 26) {
            System.out.println("A temperatura está agradável!");
        }
        else {
            System.out.println("A temperatura está quente!");
        }
    }
}
