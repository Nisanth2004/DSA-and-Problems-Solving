package org.nisanth.prep.constructor_understanding;

public class CustomerConstructor {
    int id,phoneNumber;
    String  name,place;

    public CustomerConstructor(String name, int id, String place, int phoneNumber) {
       this. id=id;
       this.name=name;
        this.place=place;
        this.phoneNumber=phoneNumber;
        System.out.println("I am Chceking calling Constructor");
    }

    public CustomerConstructor(String name) {

        this.name=name;
    }


    public static void main(String args[])
    {

        CustomerConstructor anbu=new CustomerConstructor("Anbu",1,"Perambalur",1234);
        CustomerConstructor selvam=new CustomerConstructor("Selvam");
        anbu.applyLoan();
        //selvam.applyLoan();
    }

    private void applyLoan() {

        System.out.println("Customer id is :"+id);
    }
}
