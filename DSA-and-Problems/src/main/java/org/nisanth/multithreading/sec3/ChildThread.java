package org.nisanth.multithreading.sec3;

public class ChildThread extends Thread{

    public void run()
    {
        for(int i=0;i<5;i++)
        {

           // Thread.yield(); // main thread is have priority

            try {
                Thread.sleep(1000); // running to sleeping state
            } catch (InterruptedException e) {
                System.out.println("My sleep got interupted");
               // throw new RuntimeException(e);
            }
            System.out.println("Child Thread :"+i);
        }
    }


}
