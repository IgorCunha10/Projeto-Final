package domain.plano;

public class PlanoAnual extends Plano{

    public PlanoAnual(){
        super("Plano Anual", 12, 100);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 12;
    }
}
