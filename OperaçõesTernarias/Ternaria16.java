package Ternaria;

public class Ternaria16 {
    public static void main(String[] args) {

        int idade = 65;
        boolean estudante = false;


        String resultado = (idade > 60 || estudante) ? "Qualificado para o desconto" : "Não qualificado para o desconto";

        System.out.println(resultado);
    }
}
