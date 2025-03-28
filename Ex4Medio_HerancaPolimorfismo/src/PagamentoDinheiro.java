public class PagamentoDinheiro extends Pagamento{
    public PagamentoDinheiro() {
        super();
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento em dinheiro recebido!");

    }
}
