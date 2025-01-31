package program;

import java.util.Scanner;

public class DesafiosJogos4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        int[] numeros = {num1, num2, num3};
        java.util.Arrays.sort(numeros);

        System.out.println("Os números em ordem crescente são: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
