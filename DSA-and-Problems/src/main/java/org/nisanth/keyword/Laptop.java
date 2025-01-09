package org.nisanth.keyword;

public class Laptop extends Desktop{

    public Laptop()
    {
        System.out.println("Charge");
    }

    public Laptop(String brand)
    {

        super(brand); // call the parent class constrcutor
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        Laptop lenova=new Laptop("Mac");
    }
}
