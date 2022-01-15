public abstract class Propiedad {
    private String calle;
    private int numero;

    public abstract double calcularImpuesto();

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Propiedad en la calle " + calle + ", con numero = " + numero + ", impuesto = " + calcularImpuesto();
    }
}
