package somaMaiorque100;

public class Soma {
    public int x;
    public int y;
    private int soma = x +y;

    public void Soma ( int x, int y){
        this.x = x;
        this.y = y;
        this.soma = x + y;
    }
    public int Soma1() {
        if(soma > 100) {
            System.out.println("Soma maior que 100!");

        } else if ( soma == 100) {
            System.out.println("Soma igual a 100!");
        } else {
            System.out.println("Soma não é maior que 100!");
        }
        return soma;

    }
    public String toString() {
        return "" +
                Soma1();

}
}
