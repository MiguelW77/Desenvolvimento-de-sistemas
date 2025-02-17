package Ternaria;

import java.util.Scanner;

public class Ternaria20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificação se é par ou ímpar e se é positivo ou negativo
        String resultadoParImpar = (numero % 2 == 0) ? "par" : "ímpar";
        String resultadoPositivoNegativo = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "zero";

        // Exibição dos resultados
        System.out.println("O número é " + resultadoParImpar + " e " + resultadoPositivoNegativo + ".");

        scanner.close();

    }
}
