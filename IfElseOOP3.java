/* Exercício referente ao problema 5 das "Situações Cotidianas" */

package program.Java;
import java.util.Scanner;

public class IfElseOOP3 {

    // Variáveis para o login correto
    public static String nomeUsuarioT = "usuario123";
    public static String senhaT = "12345";

    public static void main(String[] login) {
        Scanner scan = new Scanner(System.in);
        
        // Solicita o nome de usuário
        System.out.println("Nome de usuário:");
        String nomeUsuarioF = scan.nextLine();
        
        // Solicita a senha
        System.out.println("Senha:");
        String senhaF = scan.nextLine();
        
        scan.close(); // Fechar o scanner após o uso

        // Chama o método para verificar o login
        VerificLogin(nomeUsuarioF, senhaF);
    }

    // Método que verifica o login
    public static void VerificLogin(String nomeUsuarioF, String senhaF)  {
        // Comparação correta dos strings usando .equals()
        if(nomeUsuarioF.equals(nomeUsuarioT) && senhaF.equals(senhaT)) {
            System.out.println("Login bem-sucedido!"); // Login correto
        } else {
            System.out.println("Dados incorretos!"); // Dados incorretos
        }
    }
}





