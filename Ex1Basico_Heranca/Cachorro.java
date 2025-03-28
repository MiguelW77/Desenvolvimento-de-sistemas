package Ex1Basico_Heranca;

public class Cachorro extends Animal{
    private String DogName = "Helrys";

    public Cachorro(String dogName) {
        DogName = dogName;
    }

    public String getDogName() {
        return DogName;
    }

    public void setDogName(String dogName) {
        DogName = dogName;
    }

    public Cachorro() {
        super();
    }

    @Override
    public void FazerSom() {
        super.FazerSom();
        System.out.println("O CACHORRO LATE");
    }
}
