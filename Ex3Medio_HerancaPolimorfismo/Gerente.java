package Ex3Medio_HerancaPolimorfismo;

public class Gerente extends Funcionario{


    public Gerente(String nome, Double SalarioBase) {
        super(nome, SalarioBase);

    }

    @Override
    public double calcularSalario() {
        Double SalariocomBonus = SalarioBase + 1500.00;
        System.out.println("---GERENTE---");
        System.out.println("Salário" +" " + getNome() + " " +  SalariocomBonus);
        return SalariocomBonus;
    }


}
