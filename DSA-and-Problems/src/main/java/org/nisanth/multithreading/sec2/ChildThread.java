package org.nisanth.multithreading.sec2;
/*
Thread has alreday run(),start() methods
This can be overrided by ChildThread class
 */
public class ChildThread extends Thread {


    // method overriding
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Child Thread : "+i);
        }
    }
}
