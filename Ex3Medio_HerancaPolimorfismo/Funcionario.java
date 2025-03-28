package Ex3Medio_HerancaPolimorfismo;

public class Funcionario {

    private String nome = "";
    public Double SalarioBase;
    public Funcionario(){}
    public Funcionario(String nome, Double SalarioBase) {
        this.nome = nome;
        this.SalarioBase = SalarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setSalarioBase(Double novoSalario) {
        this.SalarioBase = novoSalario;
    }
    public void salarioValorAdicional(Double valorBonus){
        this.SalarioBase += valorBonus;
    }


    public double calcularSalario(){
        System.out.println("---FUNCIONARIO---");
        System.out.println("Salário" +"  "+ getNome() +" "+ SalarioBase);
        return SalarioBase;
    }
}
