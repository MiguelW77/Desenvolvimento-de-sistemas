package program;

import java.util.Scanner;

public class Matematica4 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

                System.out.print("Digite o primeiro lado: ");
                double a = scan.nextDouble();

                System.out.print("Digite o segundo lado: ");
                double b = scan.nextDouble();

                System.out.print("Digite o terceiro lado: ");
                double c = scan.nextDouble();

                if (a + b > c && a + c > b && b + c > a) {
                    System.out.println("Esses lados podem formar um triângulo.");
                } else {
                    System.out.println("Esses lados não podem formar um triângulo.");
                }

                scan.close();
            }
    }
