package com.assignment;
//Create a Gadget class with instance variables deviceName, brand, price, batteryLife, processor, and warrantyPeriod.
// Create at least two objects, assign values, and display their details.


public class Gadget {

    //instance variables
    public String deviceName;
    public String brand;
    public double price;
    public int batteryLife;
    public String processor;
    public int warrantyPeriod;

    //display
    public void display(String deviceName, String brand,double price, int batteryLife, String processor, int warrantyPeriod){
        System.out.println("Device Name : " +deviceName);
        System.out.println("Brand : " +brand);
        System.out.println("Price : " +price +" rs");
        System.out.println("Battery Life : " +batteryLife +" hrs" );
        System.out.println("Processor : " +processor);
        System.out.println("Warranty Time : " +warrantyPeriod +" years");
        System.out.println("_______________________________________________________");
    }

    public static void main(String[] args) {
        //creating objects
        Gadget g1 = new Gadget();
        Gadget g2 = new Gadget();

        //parameters
        g1.display("Smartphone","Samsung", 25000 , 15 , "Snapdragon 695 ", 3  );
        g2.display("Laptop", "Acer", 70000 , 3 , "Intel i5 14-gen", 3);

    }

}
