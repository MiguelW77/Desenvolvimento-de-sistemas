package numeroPositivoOuNegativo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VerificPositvoNegativo verificacao = new VerificPositvoNegativo();
        System.out.println("Entre  com um número:");
       int numero = scan.nextInt();
       verificacao.Verific(numero);
       System.out.println(verificacao.toString());
        scan.close();

    }
}
