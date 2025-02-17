package org.example;
import java.util.Scanner;
public class Ternaria23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        String senhaValida = (senha.length() >= 8) ? "Senha válida" : "Senha inválida";

        System.out.println(senhaValida);
    }
}
