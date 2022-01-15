package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector1 = new Scanner(System.in);

        System.out.println("Buenos dias, ingrese su nombre");
        String nombre = lector1.nextLine();
        System.out.println("Que bueno verte por aqui " + nombre + " del 0 al 20 cuanto hambre tienes ? 0 es mucho");
        int hambre = lector1.nextInt();
        System.out.println( " Tu hambre es " + morfando(hambre) + " esperamos que vuelvas pronto!");
    }

    public static int morfando(int comida) {
        int pancho = 10;
        int coca = 5;
        int hambur = 15;
        int fanta = 5;
        Scanner lector = new Scanner(System.in);
        int cantmorfi = 0;
        while (cantmorfi + comida < 20) {
            System.out.println("Que desea comer o tomar? pancho, coca, hambur o fanta ?: ");
            String respuestaUsuario = lector.nextLine();
            switch (respuestaUsuario) {
                case "pancho":
                    cantmorfi += pancho;
                    System.out.println( "Tu hambre es : " + (cantmorfi+comida) + ", recuerda que comeras hasta 20");
                    break;
                case "coca":
                    cantmorfi += coca;
                    System.out.println( "Tu hambre es : " + (cantmorfi +comida)+ ", recuerda que comeras hasta 20");
                    break;
                case "hambur":
                    cantmorfi += hambur;
                    System.out.println( "Tu hambre es : " + (cantmorfi + comida) +", recuerda que comeras hasta 20");
                    break;
                case "fanta":
                    cantmorfi += fanta;
                    System.out.println( "Tu hambre es : " + (cantmorfi+comida) + ", recuerda que comeras hasta 20");
                    break;
                default:
                    System.out.println( "Ingrese una opcion valida");
            }
        } return cantmorfi+comida;
    }
}
