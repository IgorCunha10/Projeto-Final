package domain.main;

import domain.academia.Treino;
import domain.pessoa.Aluno;
import domain.pessoa.PersonalTrainer;
import domain.plano.Plano;
import domain.plano.PlanoAnual;

public class Main {
    public static void main(String[] args) {

        Plano plano = new Plano();
        Treino treino = new Treino();

        Aluno aluno = new Aluno("João", "123.456.789-10", "4002-8922",
                20, plano, "012026", treino);

        PersonalTrainer personalTrainer = new PersonalTrainer("Fulano", "987.654.321-10",
                30, "0800-1234", "Personal", 2800, "00123");

        System.out.println(aluno);

    }
}
