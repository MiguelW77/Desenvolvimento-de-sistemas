package org.example;
import java.util.Scanner;
public class Ternaria30 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;

            String resultado = (media >= 6) ? "Aprovado" : "Reprovado";

            System.out.println(resultado);
        }
}
