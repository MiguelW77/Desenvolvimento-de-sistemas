package program.Java;

import java.util.Scanner;

public class Ternaria6 {
    public static void main(String[] args) {
        System.out.println("Informe a idade:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        boolean carteiraMotorista = true;
        String resultado = (x >= 18 && carteiraMotorista) ? "Pode dirigir!" : "Não pode dirigir!";
        System.out.println(resultado);

    }
}
