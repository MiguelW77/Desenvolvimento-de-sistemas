package somaMaiorque100;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com dois números:");
        int x  = scan.nextInt();
        int y = scan.nextInt();
        int soma = x +y;
        Soma somamaiorque100 = new Soma();
        System.out.println(somamaiorque100);
    }

}
