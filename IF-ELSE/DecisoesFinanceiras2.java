package program;

import java.util.Scanner;

public class DecisoesFinanceiras2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o valor total da sua compra? ");
        double total = scan.nextDouble();
        double desconto = 0;

        if (total <= 500) {
            desconto = total * 0.10;
        }

        // Calcular preço final
        double precoFinal = total - desconto;

        // Exibir resultados
        System.out.println("Total original: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final após desconto: R$ " + precoFinal);

        scan.close();
    }
}



