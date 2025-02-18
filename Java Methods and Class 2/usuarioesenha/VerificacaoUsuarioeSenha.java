package usuarioesenha;
public class VerificacaoUsuarioeSenha {

    public String usuarioT = "usuario123";
    public String senhaT = "1234";

    public void VerificacaoUsuarioeSenha(String usuario,String senha){
    this.usuarioT = usuario;
    this.senhaT = senha;
    }

    public String Verificacao(String usuarioT, String senhaT){
    String correto = "";
    if (usuarioT.equals(usuarioT)){
        if(senhaT.equals(senhaT))

        System.out.println("Dados incorretos, por favor tente novamente!");
    }
    else {
        System.out.println("Acesso liberado!");

    }
    return correto;

    }
    public String toString() {
        return " " +
                Verificacao(usuarioT,senhaT);
    }
}

