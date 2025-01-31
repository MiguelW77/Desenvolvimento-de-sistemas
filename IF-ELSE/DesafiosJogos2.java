package program;

import java.util.Scanner;

public class DesafiosJogos2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > 2 * num2) {
            System.out.println(num1 + " é maior que o dobro de " + num2);
        } else if (num2 > 2 * num1) {
            System.out.println(num2 + " é maior que o dobro de " + num1);
        } else {
            System.out.println("Nenhum número é maior que o dobro do outro.");
        }
    }
}
