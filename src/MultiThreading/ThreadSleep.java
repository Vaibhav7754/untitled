package MultiThreading;

import java.lang.invoke.MutableCallSite;

public class ThreadSleep extends Thread {
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println("Thread Execution for i="+i);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        t1.start();
        t2.start();
        for(int i=0;i<5;i++){
            System.out.println("This is main class");
        }

    }
}
