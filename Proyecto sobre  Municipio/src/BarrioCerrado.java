import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{
    private int factorMultiplicador;
    private List<Propiedad> list_propiedades = new ArrayList<>();

    @Override
    public double calcularImpuesto() {
        double total = 0;
        for (Propiedad prop : list_propiedades){
            total += prop.calcularImpuesto();
        }
        return total * factorMultiplicador;
    }

    public void addPropiedad(Propiedad prop){
        list_propiedades.add(prop);
    }

    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }
}
