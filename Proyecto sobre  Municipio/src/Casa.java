public class Casa extends Propiedad{
    private double montoBaseImpuesto;


    @Override
    public double calcularImpuesto() {
        double total = montoBaseImpuesto;
        if (getCalle().equals("Av. San Martín")) {
            total = montoBaseImpuesto * 1.1;
        }
        return total;
    }

    public double getMontoBaseImpuesto() {
        return montoBaseImpuesto;
    }

    public void setMontoBaseImpuesto(double montoBaseImpuesto) {
        this.montoBaseImpuesto = montoBaseImpuesto;
    }
}
