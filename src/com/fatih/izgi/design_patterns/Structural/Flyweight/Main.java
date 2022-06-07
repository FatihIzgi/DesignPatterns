package com.fatih.izgi.design_patterns.Structural.Flyweight;

public class Main {
    public static void main(String[] args) {

        SoldierProvider.provideSoldier(3,2);
        System.out.println("--");

        System.out.println("Toplam Süvari nesnesi sayısı : "+Cavalry.objectCounter);
        System.out.println("Toplam Okçu nesnesi sayısı : "+Archer.objectCounter);
    }
}
