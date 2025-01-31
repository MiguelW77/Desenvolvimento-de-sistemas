package program;
import java.util.Scanner;
public class SituacoesCotidianas3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();
        System.out.println("Escolha a conversão: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        int escolha = scan.nextInt();

        if (escolha == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " Celsius é igual a " + fahrenheit + " Fahrenheit.");
        } else if (escolha == 2) {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + " Celsius é igual a " + kelvin + " Kelvin.");
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}

