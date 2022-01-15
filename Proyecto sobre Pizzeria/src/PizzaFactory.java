public class PizzaFactory {
    // Paso 1 : Intance
    private static PizzaFactory instance;

    // Paso 2 : Ponemos privado al constructor, para que nadie pueda crear una instancia de esta clase (Solo la clase)
    private PizzaFactory(){
    }

    // Paso 3 : Creamos un metodo static getInstance
    public static PizzaFactory getInstance(){
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    // Paso 4 : Elaboramos el metodo para crear, segun el String que ingresa
    public Pizza crearPizza (String tipo){
        switch (tipo){
            case "Simple":
                return new PizzaSimple();
            case "Combinada":
                return new PizzaCombinada();
            default:
                return null;
        }
    }
}
