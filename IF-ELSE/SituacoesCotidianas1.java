package program;
import java.util.Scanner;
public class SituacoesCotidianas1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o último dígito da placa do veículo: ");
        int ultimoDigito = scan.nextInt();

        if (ultimoDigito % 2 == 0) {
            System.out.println("O veículo pode passar pelo pedágio (número par).");
        } else {
            System.out.println("O veículo não pode passar pelo pedágio (número ímpar).");
        }
    }
}

