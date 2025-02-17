package program.Java;

import java.util.Scanner;

public class Ternaria1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int x = scan.nextInt();
        String resultado = (x % 2 == 0 ) ? "par" : "ímpar";

        System.out.println("O número  " +  +  x + "  é  " +   resultado) ;
    }
}
