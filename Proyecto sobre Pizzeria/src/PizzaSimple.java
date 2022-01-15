public class PizzaSimple extends Pizza{
    private double precioBase;
    private boolean esGrande;

    @Override
    public double calcularPrecio() {
        double total = precioBase;
        if (esGrande){
            total = precioBase*2;
        }
        return total;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }
}
