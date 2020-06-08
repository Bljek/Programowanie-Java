package com.company;

public class Car {
    Integer liczbaKoni;
    String kolor;
    String model;
    String producent;
    Integer year;
    Double price;

    public Car(String model, String producent, Integer year, String kolor, Integer liczbaKoni, Double price) {
        this.model = model;
        this.producent = producent;
        this.kolor = kolor;
        this.liczbaKoni = liczbaKoni;
        this.year = year;
        this.price = price;
    }

    public Object clone() {
        Car aclone = new Car(this.model, this.producent, this.year, this.kolor, this.liczbaKoni, this.price);
        return aclone;
    }
}
