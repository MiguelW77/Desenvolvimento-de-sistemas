package program;
import java.util.Scanner;
public class DataHora1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a hora (HH:mm): ");
        String hora = scan.nextLine();

        String[] partesHora = hora.split(":");
        int horas = Integer.parseInt(partesHora[0]);
        int minutos = Integer.parseInt(partesHora[1]);

        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
            System.out.println("Hora válida.");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}
