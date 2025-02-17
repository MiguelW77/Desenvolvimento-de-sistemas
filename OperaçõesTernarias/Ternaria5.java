package program.Java;

import java.util.Scanner;

public class Ternaria5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um ano:");
        int x = scan.nextInt();
        boolean AnoBissexto = (x % 400 == 0) ? true:
                (x % 100 == 0) ? false:
                        (x % 4 == 0) ? true : false;
        System.out.println("O ano  " + "" + (AnoBissexto ? " é " : "  não é  ") +  "" + "  bissexto  ");
    }
}
