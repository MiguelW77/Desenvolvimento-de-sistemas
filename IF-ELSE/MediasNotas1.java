package program;

import java.util.Scanner;

public class MediasNotas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;

        System.out.println("Digite suas notas: " + "(média menor ou igual a 7)");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();

        if (nota1 >= 7 || nota2 >=7) {
            System.out.println("Aprovado!");
        } else {
                System.out.println("Reprovado!");
            }
        }
        }



