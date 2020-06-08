package com.company.devices;

public class Car extends Device {
    Integer liczbaKoni;
    String kolor;
    public Double price;

    public Car(String model, String producer, Integer year, String kolor, Integer liczbaKoni, Double price) {
        this.model = model;
        this.producer = producer;
        this.kolor = kolor;
        this.liczbaKoni = liczbaKoni;
        this.year = year;
        this.price = price;
    }
    public String toString(){
        return producer + " " + model + " " + kolor + " " + liczbaKoni + " " + year + " " + price;
    }

    public Object clone() {
        Car aclone = new Car(this.model, this.producer, this.year, this.kolor, this.liczbaKoni, this.price);
        return aclone;
    }
    @Override
    public void turnOn() {
        System.out.println("Car is on");
    }

}
