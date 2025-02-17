package Ternaria;

public class Ternaria18 {
    public static void main(String[] args) {

        int numero = 6;

        String resultado = (numero % 2 == 0 || numero % 3 == 0) ? "Divisível" : "Não divisível";

        System.out.println(resultado);
    }
}
