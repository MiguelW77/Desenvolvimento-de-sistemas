package Java;

import java.util.Scanner;
public class Ativ_9 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número: ");
            int n1= sc.nextInt();
            System.out.println("Insira um número: ");
            int n2= sc.nextInt();
            String result=(n1>n2)?("Maior"):("Menor ou Igual");
            System.out.println(result);
        }
    }