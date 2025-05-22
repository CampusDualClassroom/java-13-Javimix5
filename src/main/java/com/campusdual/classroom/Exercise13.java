package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.showDetails();
        System.out.println("Actualización capacidad -8 litros");
        ft.setActualFuel(-8);
        ft.showDetails();
        System.out.println("Actualización capacidad 5 litros");
        ft.setActualFuel(5);
        ft.showDetails();
    }
}