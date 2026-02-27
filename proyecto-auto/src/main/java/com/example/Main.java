package com.example;

public class Main {
    public static void main(String[] args) {
        Product auto1 = new Product();
        Product auto2 = new Product();
        Product auto3 = new Product();

        auto1.marca = "Chevrolet";
        auto2.marca = "Ford";
        auto3.marca = "Suzuki";

        auto1.modelo = 2657;
        auto2.modelo = 5572;
        auto3.modelo = 1121;

        auto1.color = "Rojo";
        auto2.color = "Negro";
        auto3.color = "Morado";

        auto1.cantidadCombustible = 100;
        auto2.cantidadCombustible = 100;
        auto3.cantidadCombustible = 100;

        auto1.darInfo();
        auto1.acelerar();

        auto2.encender();
        auto2.darInfo();

        auto3.recargar();
        auto3.encender();
    }
}