public class Test {
    public static void main(String[] args) {
    // Casa sobre “Av. San Martín”
        Propiedad casaA = PropiedadFactory.getInstance().crearPropiedad("Casa");
        casaA.setCalle("Av. San Martín");
        casaA.setNumero(130);
        ((Casa)casaA).setMontoBaseImpuesto(500);
        System.out.println("Impuesto casa A " + casaA.calcularImpuesto());

    // Casa sobre Mitre
        Propiedad casaB = PropiedadFactory.getInstance().crearPropiedad("Casa");
        casaB.setCalle("Mitre");
        casaB.setNumero(233);
        ((Casa)casaB).setMontoBaseImpuesto(700);

    // Barrio cerrado
        Propiedad barrioCerrado = PropiedadFactory.getInstance().crearPropiedad("BarrioCerrado");
        barrioCerrado.setCalle("Gutierres");
        barrioCerrado.setNumero(330);
        ((BarrioCerrado)barrioCerrado).setFactorMultiplicador(2);
        ((BarrioCerrado)barrioCerrado).addPropiedad(casaA);
        ((BarrioCerrado)barrioCerrado).addPropiedad(casaB);

        System.out.println("Impuesto Barrio Cerrado : "+barrioCerrado.calcularImpuesto());










    }
}
