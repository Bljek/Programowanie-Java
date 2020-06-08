package com.company.devices;

public class Phone extends Device{
    Double price;
    Double screenSize;
    String processor;


    public Phone(String producer, String model, Double price, Double screenSize, String processor, Integer year){
        this.producer = producer;
        this.model  = model;
        this.price = price;
        this.screenSize = screenSize;
        this.processor = processor;
        this.year = year;
    }

    public String toString(){
        return producer + " " + model + " " + price + " " + screenSize + " " + processor + " " + year;

    }

    @Override
    public void turnOn() {

    }

}