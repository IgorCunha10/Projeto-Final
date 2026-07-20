package domain.plano;

public abstract class Plano {
    private String tipo;
    private int duracaoMeses;
    private double mensalidade;

    public Plano(){}

    public Plano(String tipo, int duracao, double mensalidade) {
        this.tipo = tipo;
        this.duracaoMeses = duracao;
        this.mensalidade = mensalidade;
    }

    public abstract double calcularPreco();

    public double getPrecoBase() {
        return mensalidade;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
