package program;

import java.util.Scanner;
public class CondicoesString4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        if (palavra.length() > 5) {
            System.out.println("A palavra \"" + palavra + "\" tem mais de 5 caracteres.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" tem 5 ou menos caracteres.");
        }

        scan.close();
    }
}
