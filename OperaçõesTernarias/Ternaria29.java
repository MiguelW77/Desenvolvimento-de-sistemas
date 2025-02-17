package org.example;
import java.util.Scanner;
public class Ternaria29 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            String resultado = (idade >= 18 && idade <= 60) ? "Adulto" : (idade > 60) ? "Idoso" : "Jovem";

            System.out.println(resultado);
        }
}
