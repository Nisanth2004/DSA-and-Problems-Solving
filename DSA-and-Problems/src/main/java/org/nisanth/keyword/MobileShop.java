package org.nisanth.keyword;

public class MobileShop {


    public MobileShop(int price,int discount)
    {
        
        System.out.println(price-discount);
    }
    public MobileShop()
    {
        this(6000,300);
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        MobileShop mobileShop1=new MobileShop();
        MobileShop mobileShop2=new MobileShop(1000,5);

    }
}
