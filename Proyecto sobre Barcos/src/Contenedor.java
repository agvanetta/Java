import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga{
    private double pesoDelContenedor;
    private List<Carga> list_carga = new ArrayList<>();

    @Override
    public double calcularPeso() {
        double total = pesoDelContenedor;

        for (Carga carga : list_carga){
            total += carga.calcularPeso();
        }
        return total;
    }

    public void addCarga(Carga car){
        list_carga.add(car);
    }

    public double getPesoDelContenedor() {
        return pesoDelContenedor;
    }

    public void setPesoDelContenedor(double pesoDelContenedor) {
        this.pesoDelContenedor = pesoDelContenedor;
    }

    public List<Carga> getList_carga() {
        return list_carga;
    }

    public void setList_carga(List<Carga> list_carga) {
        this.list_carga = list_carga;
    }
}
