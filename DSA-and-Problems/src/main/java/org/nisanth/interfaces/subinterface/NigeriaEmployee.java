package org.nisanth.interfaces.subinterface;

public class NigeriaEmployee implements EmployeeRulesNigeria{
    public static void main(String[] args)
    {


        NigeriaEmployee nigeriaEmployee=new NigeriaEmployee();
        System.out.println(nigeriaEmployee.SALARY); // 2000
    }
    // we had to give defintion both interface parent and child interfaces

    @Override
    public void getData() {

    }

    @Override
    public void getInterset() {

    }

    @Override
    public void maintainHours() {

    }

    @Override
    public void report() {

    }
}
