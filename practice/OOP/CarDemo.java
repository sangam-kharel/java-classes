package com.mycompany.practice.OOP;

class Car{
    private String model, color;
    private int price;
    
    public void setCarDetails(){
        model = "Santro";
        color = "Black";
        price = 12000000;
    }
    
    public void printCarDetails() {
        System.out.println("Model : "+model);
        System.out.println("Color : "+color);
        System.out.println("Price : "+price);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.setCarDetails();
        c.printCarDetails();        
    }
    
}
