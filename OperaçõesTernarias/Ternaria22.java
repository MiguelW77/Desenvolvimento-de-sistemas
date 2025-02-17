package org.example;

import java.util.Scanner;
public class Ternaria22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        String freteGratis = (valorProduto >= 100) ? "Frete grátis" : "Sem frete grátis";

        System.out.println(freteGratis);
    }
}
