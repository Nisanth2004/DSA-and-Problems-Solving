package org.nisanth.multithreading.sec1;
/*
Thread has alreday run(),start() methods
This can be overrided by ChildThread class
 */
public class ChildThread  {


    // method overriding
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread : "+i);
        }
    }
}
