package domain.pessoa;

public class PersonalTrainer extends Funcionario{
    private String numRegistro;

    public PersonalTrainer(String nome, String cpf, int idade, String telefone,
                           String cargo, double salario, String numRegistro) {

            super(nome, cpf, idade, telefone, cargo, salario);
            this.numRegistro = numRegistro;
    }


}
