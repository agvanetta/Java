import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> list_pizza;

    /// Constructor
    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.list_pizza = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pizza> getList_pizza() {
        return list_pizza;
    }

    public void setList_pizza(List<Pizza> list_pizza) {
        this.list_pizza = list_pizza;
    }

    public void mostrarPizzas(){
        for (Pizza pizza: list_pizza){
            System.out.println(pizza.toString());
        }
    }
}
