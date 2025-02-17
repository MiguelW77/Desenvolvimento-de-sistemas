package program.Java;

import java.util.Scanner;

public class Ternaria4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int x = scan.nextInt();
        String resultado = (x % 5 == 0) ? "Multiplo de 5!" : "Não é multiplo de 5!";
        System.out.println(resultado);

    }
}
