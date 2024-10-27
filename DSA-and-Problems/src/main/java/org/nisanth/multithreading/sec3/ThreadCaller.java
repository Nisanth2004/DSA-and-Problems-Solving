package org.nisanth.multithreading.sec3;

public class ThreadCaller {
    public static void main(String[] args) throws InterruptedException {
        ChildThread childThread=new ChildThread();
        childThread.start();

       // childThread.join();// main thread will wait until childThread executes
        childThread.interrupt(); // tell child thread not sleep pls wake up

        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread: "+i);
        }
    }
}
