package com.mycompany.practice.OOP;


//Parameterized class
class car{
    private String model, color;
    private int price;
    public void setCarDetails(String m, String c, int p) {
        model = m;
        color = c;
        price = p;
    }
    /*
    Another way is using "this" operator (keyword)
    public void setCarDetails(String model, String color, int price){
        this.model = model;
        this.color = color;
        this,price = price;
    }
    */
    public void printCarDetails(){
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    }
}
public class CarDemoParameterized {
    public static void main(String[] args) {
        car c = new car();
        c.setCarDetails("Santro", "Red", 1300000);
        c.printCarDetails();
        
        car c1 = new car();
        c.setCarDetails("Swift", "Black", 1200000);
        c.printCarDetails();
        
    }
    
}
