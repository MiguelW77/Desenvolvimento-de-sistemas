package program;

import java.util.Scanner;

public class Basicos8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char caracter;

        System.out.println("Digite uma letra para verificação de vogal");
        caracter = scan.next().charAt(0);

        { if
        ( caracter == 'a' || caracter == 'A' ||  caracter == 'e'|| caracter == 'E'  || caracter == 'i'||  caracter == 'I' || caracter == 'o' || caracter == 'O'|| caracter == 'u' || caracter == 'U' )
                System.out.println("Vogal!");
        else
            System.out.println("Não é vogal!");






    }
}
}
