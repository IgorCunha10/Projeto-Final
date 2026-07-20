package domain.plano;

public class PlanoTrimestral extends Plano{

    public PlanoTrimestral() {
        super("Plano Trimestral", 3, 100);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 3 * 0.5;
    }
}
