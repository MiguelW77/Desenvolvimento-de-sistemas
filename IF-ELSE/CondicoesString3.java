package program;

import java.util.Scanner;

public class CondicoesString3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = scan.nextLine();

        if (!nome.isEmpty() && nome.charAt(0) == 'A') {
            System.out.println("O nome começa com a letra 'A'.");
        } else {
            System.out.println("O nome não começa com a letra 'A'.");
        }

        scan.close();
    }
}
