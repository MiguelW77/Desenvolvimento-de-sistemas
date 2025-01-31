package program;

import java.util.Scanner;

public class Basicos10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para verificação de intervalo entre 100 e 200:");

        int numero;

        numero = scan.nextInt();

        if ( numero >= 100 || numero <= 200 ) {
            System.out.println("O número esta no intervalo!");
        } else
                System.out.println("O número está fora do intervalo");
            }
        }



