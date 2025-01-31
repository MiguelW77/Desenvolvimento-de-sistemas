package program;

import java.util.Scanner;

public class CondicoesString5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scan.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scan.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" são iguais.");
        } else {
            System.out.println("As palavras \"" + palavra1 + "\" e \"" + palavra2 + "\" não são iguais.");
        }

        scan.close();
    }
}
