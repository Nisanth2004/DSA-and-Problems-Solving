package org.nisanth.prep.constructor_understanding;

public class ArrayMethods {
    String name;
    public ArrayMethods(String name) {
        this.name=name;
    }

    public void display()
    {
        System.out.println("This is "+name);
    }

    public static void main(String args[])
    {

        ArrayMethods arrayMethods=new ArrayMethods("Nisanth");
        ArrayMethods arrayMethod=new ArrayMethods("Sujith");

        ArrayMethods[] students={arrayMethods,arrayMethod};

        for(ArrayMethods array:students)
        {
            array.display();
        }


    }
}
