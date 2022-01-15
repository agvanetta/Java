public class ServicioFactory {
    private static ServicioFactory instance;

    private ServicioFactory(){};
    public static ServicioFactory getInstance(){
        if(instance == null){
            instance = new ServicioFactory();
        }
        return instance;
    }
    public Servicio crearServicio(String tipo){
        switch (tipo){
            case "Combo":
                return new Combo();
            case "Simple":
                return new Simple();
            default:
                return null;
        }
    }
}
