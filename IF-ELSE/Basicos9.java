package program;

import java.util.Scanner;

public class Basicos9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Verifique se um número está entre  10 a 50, digite um número: ");
        int numero = scan.nextInt();


if (numero >= 10 && numero <= 50 ) {
    System.out.println("Esse número está entre 10 e 50! ");
        }
else {
    System.out.println("Esse número não está entre 10 e 50! ");
}
    }
}
