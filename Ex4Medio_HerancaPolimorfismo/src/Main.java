//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[3];
        pagamentos[0] = new Pagamento();
        pagamentos[1] = new PagamentoCartao();
        pagamentos[2] = new PagamentoDinheiro();

        for(Pagamento pagamento : pagamentos ){
            pagamento.realizarPagamento();
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}
