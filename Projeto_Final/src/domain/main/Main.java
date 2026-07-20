package domain.main;

import domain.academia.Treino;
import domain.pessoa.Aluno;
import domain.plano.Plano;
import domain.plano.PlanoAnual;

public class Main {
    public static void main(String[] args) {

        Plano plano = new Plano();
        Treino treino = new Treino();

        Aluno aluno = new Aluno("João", "123.456.789-10", "4002-8922",
                20, plano, "012026", treino);

        System.out.println(aluno.getMatricula());
    }
}
