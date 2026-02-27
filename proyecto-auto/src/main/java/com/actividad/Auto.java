package com.actividad;

public class Auto {
    String marca;
    int modelo;
    String color;
    int cantidadCombustible;

    public void encender() {
        if (cantidadCombustible >= 20) {
            System.out.println("El coche ha arrancado");
            cantidadCombustible -= 5;            
        } else {
            System.out.println("Rellene el combustible del coche para poder arrancar");
        }
    }

    public void darInfo() {
        System.out.println("La marca del coche es: " + marca);
        System.out.println("El modelo del coche es: " + modelo);
        System.out.println("El color del coche es: " + color);
        System.out.println("El combustible actual del coche es del: " + cantidadCombustible);
    }

    public void acelerar() {
        if (cantidadCombustible >= 40) {
            System.out.println("El coche procederá a acelerar");
            cantidadCombustible -= 20;
        } else {
            System.out.println("combustible insuficiente, por favor rellena el tanque al menos al 40%");
        }
    }
    public void recargar() {
        System.out.println("El carro a recargado el combustible");
        cantidadCombustible = 100;
    }

}
