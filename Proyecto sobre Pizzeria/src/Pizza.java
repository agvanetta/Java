public abstract class Pizza {
    private String nombre;
    private String descripcion;

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // toString :  mostrar todas las pizzas simples y combinadas que
    //vende indicando el nombre y precio de cada una.
    @Override
    public String toString() {
        return "Nombre : "+nombre+", precio : $ "+calcularPrecio();
    }
}
