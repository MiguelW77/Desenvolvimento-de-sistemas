package org.example;
import java.util.Scanner;
public class Ternaria28 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            String resultado = (numero >= 20 && numero <= 30) ? "Dentro do intervalo" : "Fora do intervalo";

            System.out.println(resultado);
        }
}
