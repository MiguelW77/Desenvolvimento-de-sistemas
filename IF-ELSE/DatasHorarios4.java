package program;
import java.util.Scanner;
public class DataHora4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a hora (HH:mm): ");
        String hora = scan.nextLine();

        String[] partesHora = hora.split(":");
        int horas = Integer.parseInt(partesHora[0]);

        if (horas >= 6 && horas < 12) {
            System.out.println("Manhã");
        } else if (horas >= 12 && horas < 18) {
            System.out.println("Tarde");
        } else if (horas >= 18 && horas < 24) {
            System.out.println("Noite");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}
