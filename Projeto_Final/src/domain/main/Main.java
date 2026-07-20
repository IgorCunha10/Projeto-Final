package domain.main;

import domain.pessoa.Aluno;
import domain.pessoa.PersonalTrainer;
import domain.plano.Plano;
import domain.plano.PlanoAnual;
import domain.plano.PlanoMensal;
import domain.plano.PlanoTrimestral;

public class Main {
    public static void main(String[] args) {

        Plano planoMensal = new PlanoMensal();
        Plano planoTrimestral = new PlanoTrimestral();
        Plano planoAnual = new PlanoAnual();


        Aluno aluno = new Aluno("João", "123.456.789-10", "4002-8922",
                20, planoMensal, "012026");

        Aluno aluno2 = new Aluno("Maria", "111.222.333-44", "9 9999-9999", 31,
                planoTrimestral, "022026");

        PersonalTrainer personalTrainer = new PersonalTrainer("Fulano", "987.654.321-10",
                30, "0800-1234", "Personal", 2800, "00123");

        System.out.println(aluno);
        System.out.println();
        System.out.println(aluno2);
        System.out.println();
        System.out.println(personalTrainer);

    }
}
