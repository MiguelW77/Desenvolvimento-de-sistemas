package program;

import java.util.Scanner;

public class DesafiosJogos3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroSecreto = 7;  // Você pode mudar este número para qualquer outro
        System.out.print("Adivinhe o número secreto: ");
        int palpiteUsuario = scan.nextInt();

        if (palpiteUsuario == numeroSecreto) {
            System.out.println("Parabéns! Você adivinhou o número secreto.");
        } else {
            System.out.println("Desculpe, esse não é o número secreto.");
        }
    }
}
