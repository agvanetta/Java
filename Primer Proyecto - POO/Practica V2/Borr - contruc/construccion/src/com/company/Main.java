package com.company;

public class Main {

    public static void main(String[] args) {

         Construccion construccion = new Construccion("calle10", 2022,2022,2022);
         Departamento departamento1 = new Departamento(1,"living","Medellin", "FINALIZADO",construccion,5,5);
         Departamento departamento2 = new Departamento(1,"living","Medellin", "FINALIZADO",construccion,4,5);

        //Interfaz comparable
        System.out.println(departamento1.compareTo(departamento2));

        //metodo esRascacielos
        System.out.println(departamento1.esRascacielos());

        //metodo finalizoEnFecha
        System.out.println(departamento1.finalizaEnFecha());



    }
}
