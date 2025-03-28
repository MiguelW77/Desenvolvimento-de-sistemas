package Ex3Medio_HerancaPolimorfismo;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, Double SalarioBase) {

        super(nome, SalarioBase);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double calcularSalario() {
        double SalariocomAumento = SalarioBase + (SalarioBase * 0.10);
        System.out.println("---DESENVOLVEDOR---");
        System.out.println("Salário " + " " + getNome() + " "+ SalariocomAumento);
        return SalariocomAumento;
    }
}


