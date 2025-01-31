package program;

import java.util.Scanner;

import java.util.Random;

public class DesafiosJogos5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(10) + 1;  // Número aleatório entre 1 e 10

        System.out.print("Adivinhe o número entre 1 e 10: ");
        int palpiteUsuario = scan.nextInt();

        if (palpiteUsuario == numeroSecreto) {
            System.out.println("Parabéns! Você adivinhou o número correto.");
        } else {
            System.out.println("Desculpe, o número correto era " + numeroSecreto + ".");
        }
    }
}
