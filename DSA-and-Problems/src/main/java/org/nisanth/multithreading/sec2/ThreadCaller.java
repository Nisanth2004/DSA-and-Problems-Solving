package org.nisanth.multithreading.sec2;

import org.nisanth.multithreading.sec2.ChildThread;
import org.nisanth.patterns.DownTriangle;

public class ThreadCaller {

    // Inheritance - Invoking parent class
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        System.out.println(childThread.getState()); // NEW

        childThread.setPriority(1); // 10-> low

         childThread.start(); // you are starting a new thread (parallel execution)



        System.out.println(childThread.getState()); // RUNNABLE



        /*
               if we call the run method means it is single thraed or sequence execution
         */

        for(int j=0;j<5;j++)
        {
            System.out.println("Main Thread: "+j);

        }
        System.out.println(childThread.getState()); // BLOCKED/TERMINATED
    }
}


