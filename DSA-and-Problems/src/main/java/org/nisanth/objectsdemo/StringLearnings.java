package org.nisanth.objectsdemo;

import java.util.SplittableRandom;

public class StringLearnings extends Object {
    int price;
    public static void main(String[] args)
    {
        String s=new String();
        System.out.println(s);

        StringLearnings stringLearnings=new StringLearnings();

        // internally called Object class method toString()
        System.out.println(stringLearnings); // org.nisanth.objectsdemo.StringLearnings@372f7a8d -> hashcode
        System.out.println();
        System.out.println(stringLearnings.hashCode());


        stringLearnings.price=100;



        StringLearnings stringLearnings2=new StringLearnings();
        stringLearnings2.price=100;


        if(stringLearnings.equals(stringLearnings2))
        {
            System.out.println("Both Objects are equal");
        }
        else {
            System.out.println("Not equal");
        }

    }



    // here we override the toString() method so it is called when object is printed
    public String toString()
    {
        return "Hashcode of toString()";
    }


 // usually both objects cannot be compared directly beacuse memory is different,but we compare the behaviour of  the object
    @Override
    public boolean equals(Object o)
    {

        // parent object 'o' wil convert to child class object to access the property price
        StringLearnings s=(StringLearnings) o;
        if(this.price==s.price) // fisrt obj price == second obj price
        return true;
        else return false;
    }
}
