package org.nisanth.multithreading.sec1;

import org.nisanth.multithreading.sec1.ChildThread;

public class ThreadCaller {

    // Inheritance - Invoking parent class
    public static void main(String[] args)
    {
        ChildThread childThread=new ChildThread();
        //childThread.start(); start() method internally called the run method
    }
}
