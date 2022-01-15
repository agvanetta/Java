import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Servicio> list_servicio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Servicio> getList_servicio() {
        return list_servicio;
    }

    public void setList_servicio(List<Servicio> list_servicio) {
        this.list_servicio = list_servicio;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
        list_servicio = new ArrayList<>();
    }

    public void mostrarServicios(){
        for (Servicio servicio : list_servicio){
            System.out.println( "Servicio :" + servicio.getNombre());
        }
    }
}
