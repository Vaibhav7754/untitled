package MultiThreading;

public class ThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("This is child thread");

        }
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        for(int i=0;i<=5;i++){
            System.out.println("This is main thread");

        }
    }
}
