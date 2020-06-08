package com.company.devices;

public class Car {
    Integer liczbaKoni;
    String kolor;
    String model;
    String producent;
    Integer year;
    public Double price;

    public Car(String model, String producent, Integer year, String kolor, Integer liczbaKoni, Double price) {
        this.model = model;
        this.producent = producent;
        this.kolor = kolor;
        this.liczbaKoni = liczbaKoni;
        this.year = year;
        this.price = price;
    }
    public String toString(){
        return producent + " " + model + " " + kolor + " " + liczbaKoni + " " + year + " " + price;
    }

    public Object clone() {
        Car aclone = new Car(this.model, this.producent, this.year, this.kolor, this.liczbaKoni, this.price);
        return aclone;
    }
}
