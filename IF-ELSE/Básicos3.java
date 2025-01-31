package program;

import java.util.Scanner;

public class Básicos3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Digite dois números para exibição do maior:");
      x = scan.nextInt();
     y = scan.nextInt();

    if (x > y){
        System.out.println("Maior número é" + x);
    }
    if (y > x){
        System.out.println("Maior número é" + y);
    }
    }
}
