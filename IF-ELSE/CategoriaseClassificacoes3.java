package program;
import java.util.Scanner;

public class CategoriasEClassificacoes3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura em 'cm': ");
        int altura = scan.nextInt();

        if (altura <= 160) {
            System.out.println("Você é baixo!");
        }
        else if (altura <= 180) {
            System.out.println("Você é mediano!");
        }
        else {
            System.out.println("Você é alto!");
        }
    }
}

