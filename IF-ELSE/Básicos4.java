package program;

import java.util.Scanner;

public class Básicos4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.printf("Digite idade para votar:" + "(idade mínima 16 anos)");
        idade = scan.nextInt();;

        if (idade < 16){
            System.out.println("Não é possivel votar!");
        }
        if(idade >= 16) {
            System.out.println(" Pessoa apta ao voto!");
        }

    }
}
