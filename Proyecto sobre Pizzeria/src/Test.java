public class Test {
    public static void main(String[] args) {

        Pizza pizzaMuzzarellaChica = PizzaFactory.getInstance().crearPizza("Simple");
        pizzaMuzzarellaChica.setNombre("Pizza Muzza 🍕");
        pizzaMuzzarellaChica.setDescripcion( " Pizza de muzzarella simple ");
        ((PizzaSimple) pizzaMuzzarellaChica).setEsGrande(false);
        ((PizzaSimple) pizzaMuzzarellaChica).setPrecioBase(700);
        System.out.println(pizzaMuzzarellaChica.toString());

        Pizza pizzaEspecialChica = PizzaFactory.getInstance().crearPizza("Simple");
        pizzaEspecialChica.setNombre("Pizza Especial 🍕");
        pizzaEspecialChica.setDescripcion(" Pizza especial chica");
        ((PizzaSimple) pizzaEspecialChica).setEsGrande(false);
        ((PizzaSimple) pizzaEspecialChica).setPrecioBase(850);
        System.out.println(pizzaEspecialChica.toString());

        Pizza pizzaAnanaChica = PizzaFactory.getInstance().crearPizza("Simple");
        pizzaAnanaChica.setNombre("Pizza Anana 🍕");
        pizzaAnanaChica.setDescripcion("Pizza de Anana Chica");
        ((PizzaSimple) pizzaAnanaChica).setEsGrande(false);
        ((PizzaSimple) pizzaAnanaChica).setPrecioBase(950);
        System.out.println(pizzaAnanaChica.toString());

        Pizza pizzaCominadaLoca = PizzaFactory.getInstance().crearPizza("Combinada");
        pizzaCominadaLoca.setNombre( "Pizza combinada 🍕");
        pizzaCominadaLoca.setDescripcion("Pizza combinada mitad especial, mitad anana");
        ((PizzaCombinada) pizzaCominadaLoca).addPizza(pizzaAnanaChica);
        ((PizzaCombinada) pizzaCominadaLoca).addPizza(pizzaEspecialChica);
        System.out.println(pizzaCominadaLoca.toString());

    }
}
