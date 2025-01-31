package program;

import java.util.Scanner;

public class CategoriasEClassificacoes4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a pressão sistólica (mmHg): ");
        int sistolica = scan.nextInt();

        System.out.print("Digite a pressão diastólica (mmHg): ");
        int diastolica = scan.nextInt();

        String nivelDeRisco = avaliarNivelDeRisco(sistolica, diastolica);

        System.out.println("Nível de risco baseado na pressão arterial: " + nivelDeRisco);

        scan.close();
    }

    public static String avaliarNivelDeRisco(int sistolica, int diastolica) {
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Normal");
        } else if ((sistolica >= 120 && sistolica <= 139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("Moderado");
        } else {
            System.out.println("Alto");
        }
        return "Inválido";
    }
}
