public class CargaSimple extends Carga{
    private double pesoDeLaCarga;
    private boolean necesitaRegrigeracion;


    @Override
    public double calcularPeso() {
        double total = pesoDeLaCarga;
        if (necesitaRegrigeracion){
            return total * 1.10;
        }
        return total;
    }

    public double getPesoDeLaCarga() {
        return pesoDeLaCarga;
    }

    public void setPesoDeLaCarga(double pesoDeLaCarga) {
        this.pesoDeLaCarga = pesoDeLaCarga;
    }

    public boolean isNecesitaRegrigeracion() {
        return necesitaRegrigeracion;
    }

    public void setNecesitaRegrigeracion(boolean necesitaRegrigeracion) {
        this.necesitaRegrigeracion = necesitaRegrigeracion;
    }
}
