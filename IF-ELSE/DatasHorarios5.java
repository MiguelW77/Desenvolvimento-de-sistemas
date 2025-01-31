package program;

import java.util.Scanner;

import java.time.LocalDate;

public class DataHora5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a data de início (aaaa-mm-dd): ");
        String dataInicio = scan.nextLine();
        System.out.print("Digite a data de término (aaaa-mm-dd): ");
        String dataFim = scan.nextLine();
        System.out.print("Digite a data para verificar (aaaa-mm-dd): ");
        String dataParaVerificar = scan.nextLine();

        LocalDate inicio = LocalDate.parse(dataInicio);
        LocalDate fim = LocalDate.parse(dataFim);
        LocalDate data = LocalDate.parse(dataParaVerificar);

        if (!data.isBefore(inicio) && !data.isAfter(fim)) {
            System.out.println("A data está dentro do intervalo especificado.");
        } else {
            System.out.println("A data está fora do intervalo especificado.");
        }
    }
}

