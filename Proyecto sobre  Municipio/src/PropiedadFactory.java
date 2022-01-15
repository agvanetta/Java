public class PropiedadFactory {
    private static PropiedadFactory instance;

    private PropiedadFactory(){
    }
    public static PropiedadFactory getInstance(){
        if(instance == null){ //
            instance = new PropiedadFactory();
        }
        return instance;
    }
    public Propiedad crearPropiedad (String tipo) {
        switch (tipo) {
            case "Casa":
                return new Casa();
            case "BarrioCerrado":
                return new BarrioCerrado();
            default:
                return null;
        }
    }
}
