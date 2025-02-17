package org.example;

import java.util.Scanner;

public class Ternaria21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? ((numero > 0) ? "Par e positivo" : (numero < 0) ? "Par e negativo" : "Par e zero") : ((numero > 0) ? "Ímpar e positivo" : (numero < 0) ? "Ímpar e negativo" : "Ímpar e zero");

        System.out.println(resultado);
    }
}
