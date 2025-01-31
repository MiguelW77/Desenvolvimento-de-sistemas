package program;

import java.util.Scanner;

public class DecisoesFinanceiras5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o valor total da sua compra? ");
        double total = scan.nextDouble();
        double brinde = 0;

        if (total < 500) {
            brinde = 0;
            System.out.println("Sua compra não tem direito a um brinde grátis");
        }
        else {
            System.out.println("Sua compra tem direito a um brinde grátis");
        }
        scan.close();
    }
}

