package org.nisanth.interfaces.gettersetter;

public class SBICustomer {

    public static void main(String[] args)
    {
        SBIBank sbiBank=new SBIBank();

        System.out.println(sbiBank.getMinBalance());

        sbiBank.setEMI(200);

        System.out.println(sbiBank.getEMI());
    }
}
