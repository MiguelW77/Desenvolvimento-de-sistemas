package program;

import java.util.Scanner;

public class CategoriasEClassificacoes1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança!");
        }
        else if (idade <= 17) {
            System.out.println("Você é um adolescente!");
        }
        else if (idade <= 59) {
            System.out.println("Você é um adulto!");
        }
        else {
            System.out.println("Você é um idoso!");
        }
    }
}

