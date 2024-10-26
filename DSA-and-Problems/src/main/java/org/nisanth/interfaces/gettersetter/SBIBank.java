package org.nisanth.interfaces.gettersetter;

public class SBIBank {

    private int minBalance=5000;
    private int EMI=100;

    public int getMinBalance() {
        // this allows customer to see the balance not to change the value
        return this.minBalance;
    }

   public int getEMI()
   {
       return this.EMI;
   }

   public void setEMI(int value)
   {
       if(value>100)
       {
           this.EMI=value;
       }
   }
}
