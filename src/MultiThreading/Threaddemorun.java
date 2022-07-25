package MultiThreading;

public class Threaddemorun implements Runnable {
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("This is child thread");

        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        Thread t = new Thread(t1);
        t.start();
        for(int i=0;i<=5;i++){
            System.out.println("This is main thread");

        }
    }
}
