package program;

import java.util.Scanner;

public class CondicoesString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a Senha:");
        String senha = scan.nextLine();

        if (senha.equals("1234")) {
            System.out.println("Senha Correta!");
        } else {
            System.out.println("Senha Incorreta!");
        }
    }
}
