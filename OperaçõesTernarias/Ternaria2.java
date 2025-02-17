package program.Java;

import java.util.Scanner;

public class Ternaria2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma idade:");
        int idade = scan.nextInt();
        String resultado = ( idade >=18) ? "Maior de idade!" : "Menor de idade!";
        System.out.println(resultado);
    }
}
