package program;

import java.util.Scanner;

public class SituacoesCotidianas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigoCorreto = 1234;  // Código de acesso de exemplo
        System.out.print("Digite o código de acesso: ");
        int codigoDigitado = scan.nextInt();

        if (codigoDigitado == codigoCorreto) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
