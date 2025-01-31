package program;

import java.util.Scanner;

public class Basicos7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Digite um  número para verificação multiplo de 5");
        numero = scan.nextInt();

        if ( numero % 5 == 0);{
            System.out.println("Número divisivel por 5");

        }


    }
}
