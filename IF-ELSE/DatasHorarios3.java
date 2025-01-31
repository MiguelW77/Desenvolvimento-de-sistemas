package program;
import java.util.Scanner;
public class DataHora3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o mês (1-12): ");
        int mes = scan.nextInt();
        System.out.print("Digite o dia: ");
        int dia = scan.nextInt();

        boolean isValid = false;
        if (mes == 2) {
            if (dia >= 1 && dia <= 28) isValid = true;  // Ano não bissexto
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 1 && dia <= 30) isValid = true;
        } else if (mes >= 1 && mes <= 12) {
            if (dia >= 1 && dia <= 31) isValid = true;
        }

        if (isValid) {
            System.out.println("Dia válido para o mês " + mes);
        } else {
            System.out.println("Dia inválido para o mês " + mes);
        }
    }
}

