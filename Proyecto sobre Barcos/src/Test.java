public class Test {
    public static void main(String[] args) {
    Carga tv32 = CargaFactory.getInstance().crearCarga("Simple");
    tv32.setNombre("Televisor");
    tv32.setDescripcion("Tv 32' LCD");
        ((CargaSimple) tv32).setPesoDeLaCarga(3);
        ((CargaSimple) tv32).setNecesitaRegrigeracion(false);

    Carga cajaDeMedicamentos = CargaFactory.getInstance().crearCarga("Simple");
    cajaDeMedicamentos.setNombre("Caja de medicamentos");
    cajaDeMedicamentos.setDescripcion("Caja de medicamentos, mantener cadena de frio");
        ((CargaSimple) cajaDeMedicamentos).setPesoDeLaCarga(2);
        ((CargaSimple) cajaDeMedicamentos).setNecesitaRegrigeracion(true);

    Carga contenedor = CargaFactory.getInstance().crearCarga("Contenedor");
    contenedor.setNombre("Contenedor");
    contenedor.setDescripcion("Contenedor de 100kgs");
        ((Contenedor) contenedor).setPesoDelContenedor(100);
        ((Contenedor) contenedor).addCarga(tv32);
        ((Contenedor) contenedor).addCarga(cajaDeMedicamentos);
        System.out.println("Peso del contenedor en total es de = " + contenedor.calcularPeso());
    }
}
