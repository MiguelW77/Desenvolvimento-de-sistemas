package org.example;
import java.util.Scanner;

public class Ternaria26 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            String resultadoVoto = (idade >= 16) ? "Pode votar" : "Não pode votar";

            System.out.println(resultadoVoto);
        }
}
