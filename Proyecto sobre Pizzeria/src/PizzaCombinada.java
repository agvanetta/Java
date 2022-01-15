import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{
    private List<Pizza> list_pizza = new ArrayList<>();

    public List<Pizza> getList_pizza() {
        return list_pizza;
    }

    public void setList_pizza(List<Pizza> list_pizza) {
        this.list_pizza = list_pizza;
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Pizza pizza : list_pizza){
            total += pizza.calcularPrecio();
        }
        return total / list_pizza.size();
    }

    public void addPizza(Pizza pi){
        list_pizza.add(pi);
    }
}
