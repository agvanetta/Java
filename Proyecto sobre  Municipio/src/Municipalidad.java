import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private String nombre;
    private List<Propiedad> list_prop;

    public Municipalidad(String nombre) {
        this.nombre = nombre;
        list_prop = new ArrayList<>();
    }

    public void mostrarPropiedad(){
        for(Propiedad prop : list_prop){
            System.out.println(prop.toString());
        }
    }


    public void agregarPropiedad(Propiedad prop){
        list_prop.add(prop);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
