package program;

import java.util.Scanner;

public class SituacoesCotidianas5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeDeUsuarioCorreto = "usuario123";  // Nome de usuário de exemplo
        String senhaCorreta = "senha";  // Senha de exemplo

        System.out.print("Digite seu nome de usuário: ");
        String nomeDeUsuarioDigitado = scan.nextLine();
        System.out.print("Digite sua senha: ");
        String senhaDigitada = sc.nextLine();

        if (nomeDeUsuarioDigitado.equals(nomeDeUsuarioCorreto) && senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Nome de usuário ou senha inválidos.");
        }
    }
}
