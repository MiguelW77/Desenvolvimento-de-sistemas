package program.Java;

import java.util.Scanner;

public class Ternaria7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int x = scan.nextInt();
        String resultado = (x % 2 == 0 && x < 0 ) ? "Sim!" : "Não!";
        System.out.println(resultado);


    }
}
