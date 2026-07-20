package domain.pessoa;

import domain.academia.Treino;
import domain.plano.Plano;

public class Aluno extends Pessoa{

    private String matricula;
    private Plano plano;
    private Treino treino;

    public Aluno(String nome, String cpf, String telefone, int idade,
                 Plano plano, String matricula, Treino treino) {

        super(nome, cpf, idade, telefone);
        this.plano = plano;
        this.matricula = matricula;
        this.treino = treino;

    }

    public String getMatricula() {
        return matricula;
    }

    public Plano getPlano() {
        return plano;
    }

    public Treino getTreino() {
        return treino;
    }


}
