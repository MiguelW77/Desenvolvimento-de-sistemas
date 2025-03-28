package Ex3Medio_HerancaPolimorfismo;

public class main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Maria Luiza", 1500.00);
        Gerente gerente = new Gerente("Miguel", 2000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Davi Senai Soares", 1500.00);

        funcionario.calcularSalario();
        gerente.calcularSalario();
        desenvolvedor.calcularSalario();
    }
}
