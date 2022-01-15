public class Simple extends Servicio{
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        double total = precio;
        if (getNombre() == "Colocación"){
            total = precio * 1.10;
        }
        return total;
    }
}
