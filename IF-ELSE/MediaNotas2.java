package program;

import java.util.Scanner;

public class MediaNotas2 {
    public static void main(String[] args) {
        double nota;
        System.out.println("Digite a nota para verificaçao de aprovação, recuperação ou reprovação" + "(média maior ou igual a 5 e menor que 7)");

        Scanner scan = new Scanner(System.in);
        nota = scan.nextDouble();


        if (nota >=5 && nota <= 7 ) {
            System.out.println("Recuperação");

        }
        if (nota > 6 ){
            System.out.println("Aprovado!");

        }else{
            System.out.println("Reprovado!");
        }

    }
}
