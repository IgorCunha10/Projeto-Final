package domain.plano;

public class PlanoMensal extends Plano{

    public PlanoMensal() {
        super("Plano Mensal", 1, 100.0);
    }
    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }
}
