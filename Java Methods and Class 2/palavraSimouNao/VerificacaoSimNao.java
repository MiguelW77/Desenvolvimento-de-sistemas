package palavraSimouNao;

public class VerificacaoSimNao {
    private String palavra = "";

    public void Palavra (String palavra){
        this.palavra = palavra;

    }
    public String VerificacaoSimnao(String palavra){
        if (palavra == "sim") {
            palavra ="sim";
        }else if (palavra == "nao") {
            palavra ="nao";

        }
        return palavra;
    }
    public String toString() {
        return " " + palavra;
    }
}
