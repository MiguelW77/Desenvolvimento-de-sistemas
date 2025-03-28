package Ex2Basico_Polimorfismo;

public class Bicicleta extends Veiculo{
    public Bicicleta() {
        super();
    }

    @Override
    public void mover() {
        super.mover();
        System.out.println("A bicicleta está se movendo lentamente");
    }
}
