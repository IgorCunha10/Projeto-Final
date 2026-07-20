package domain.pessoa;

import domain.academia.Treino;
import domain.plano.Plano;

public class Aluno extends Pessoa{

    private Plano plano;
    private Treino treino;

    public Aluno(String nome, String cpf, String telefone, int idade) {
        super(nome, cpf, idade, telefone);
        this.plano = plano;

    }
}
