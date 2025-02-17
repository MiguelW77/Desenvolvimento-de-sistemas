package Ternaria;

public class Ternaria19 {
    public static void main(String[] args) {

        double nota = 6.5; // Altere esse valor para testar outros casos
        String status = (nota >= 7) ? "Aprovado" : (nota >= 5) ? "Recuperação" : "Reprovado";
        System.out.println("Status do aluno: " + status);
    }
}
