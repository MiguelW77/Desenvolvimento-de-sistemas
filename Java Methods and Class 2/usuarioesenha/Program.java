package usuarioesenha;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de usúario:");
        String usuario = scan.nextLine();
        System.out.println("Digite a senha:");
        String senha = scan.nextLine();
        VerificacaoUsuarioeSenha verificUeS = new VerificacaoUsuarioeSenha();
        System.out.println(verificUeS);
        scan.close();
    }

}
