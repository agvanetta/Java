import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio{
    private double descuento;
    private List<Servicio> list_servicio = new ArrayList<>();

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public List<Servicio> getList_servicio() {
        return list_servicio;
    }

    public void setList_servicio(List<Servicio> list_servicio) {
        this.list_servicio = list_servicio;
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Servicio servicio : list_servicio){
            total += servicio.calcularPrecio();
        }
        return total - (total * descuento);
    }

    public void addServicio(Servicio sv){
        list_servicio.add(sv);
    }



}
