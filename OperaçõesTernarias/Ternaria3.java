package program.Java;

import java.util.Scanner;

public class Ternaria3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int x = scan.nextInt();
        String resultado = (x > 0) ? "Positivo!" : (x < 0) ? "Negativo!" : "Igual a zero!";
        System.out.println(resultado);
    }
}
