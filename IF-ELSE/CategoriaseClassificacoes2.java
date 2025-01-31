package program;

import java.util.Scanner;

public class CategoriasEClassificacoes2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int numero = scan.nextInt();

            if (numero <= 10) {
                System.out.println("Você é um A!");
            }
            else if (numero <= 20) {
                System.out.println("Você é um B!");
            }
            else {
                System.out.println("Você é um C!");
            }
        }
}

