package domain.pessoa;

import domain.plano.Plano;

public class Aluno extends Pessoa{

    private String matricula;
    private Plano plano;


    public Aluno(String nome, String cpf, String telefone, int idade,
                 Plano plano, String matricula) {

        super(nome, cpf, idade, telefone);
        this.plano = plano;
        this.matricula = matricula;

    }

    public String getMatricula() {
        return matricula;
    }

    public Plano getPlano() {
        return plano;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMatrícula: " + getMatricula() +
                "\nPlano: " + getPlano();
    }

}
