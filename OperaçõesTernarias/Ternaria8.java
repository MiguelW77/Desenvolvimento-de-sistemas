package program.Java;

import java.util.Scanner;

public class Ternaria8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a nota:");
        int x = scan.nextInt();
        String resultado = (x >= 7) ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);

    }
}
