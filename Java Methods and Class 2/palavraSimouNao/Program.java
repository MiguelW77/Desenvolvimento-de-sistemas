package palavraSimouNao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        VerificacaoSimNao SimouNao = new VerificacaoSimNao();
        System.out.println("Palavra digitada:" + palavra);
    }
}
