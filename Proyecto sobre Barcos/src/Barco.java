import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> list_carga;

    // Constructor
    public Barco(String nombre) {
        this.nombre = nombre;
        list_carga = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carga> getList_carga() {
        return list_carga;
    }

    public void setList_carga(List<Carga> list_carga) {
        this.list_carga = list_carga;
    }

    public void agregarCarga (Carga car){
        list_carga.add(car);
    }

    public void mostrarCargas(){
        for (Carga carga : list_carga){
            System.out.println("Nombre de la carga : "+carga.getNombre());
        }
    }
}
