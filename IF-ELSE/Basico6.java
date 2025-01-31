package program;

import java.util.Scanner;

public class Basico6 {
    public static void main(String[] args) {
        int ano;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano para verificação de ano bisexto");
        ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Ano bissexto!");

        } else {
            System.out.println("Esse ano não é ano bissexto!");


        }
    }
}
