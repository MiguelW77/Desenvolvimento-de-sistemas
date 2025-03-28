public class PagamentoCartao extends Pagamento{
    public PagamentoCartao() {
        super();
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com cartão aprovado!");

    }
}
