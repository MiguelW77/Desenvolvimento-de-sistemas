package org.example;
import java.util.Scanner;
public class Ternaria25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do dia da semana (1 a 7): ");
        int dia = sc.nextInt();

        String tipoDia = (dia >= 2 && dia <= 6) ? "Dia útil" : "Final de semana";

        System.out.println(tipoDia);
    }
}

