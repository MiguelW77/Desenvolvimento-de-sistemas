package Ternaria;

import java.util.Scanner;

public class Ternaria17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada dos lados do triângulo
        System.out.println("Digite o primeiro lado do triângulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo:");
        double lado3 = scanner.nextDouble();

        // Determinação do tipo de triângulo usando a condição ternária
        String tipoTriangulo = (lado1 == lado2 && lado2 == lado3) ? "Equilátero" :
                (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) ? "Isósceles" :
                        "Escaleno";

        System.out.println("O triângulo é: " + tipoTriangulo);

        scanner.close();
    }
}
