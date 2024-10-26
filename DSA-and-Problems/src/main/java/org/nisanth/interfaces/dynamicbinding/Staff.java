package org.nisanth.interfaces.dynamicbinding;

public class Staff extends Ceo{
    public static void main(String[] args)
    {
        Ceo c=new Staff(); // dynamic binding
        // explanation -> CEO will come to Chennai workplace
        c.work();
    }

    public void work()
    {
        System.out.println("Working in Chennai");
    }

}
