package Ex2Basico_Polimorfismo;

public class Carro extends Veiculo{
    public Carro() {
        super();
    }

    @Override
    public void mover() {
        super.mover();
        System.out.println("O carro está se movendo rapidamente");
    }
}
