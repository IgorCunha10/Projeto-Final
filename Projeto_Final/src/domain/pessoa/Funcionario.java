package domain.pessoa;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int idade, String telefone,
                       String cargo, double salario) {

            super(nome, cpf, idade, telefone);
            this.cargo = cargo;
            this.salario = salario;

    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nCargo: " + getCargo() +
        "\nSalário: " + getSalario();
    }


}
