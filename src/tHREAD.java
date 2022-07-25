
class Thread1 extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Thread1 is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }

}
class Thread2 implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("Thread 2 is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
public class tHREAD {
    public static void main(String[] args) {
        int n = 10; //Numbers of Threads
        for(int i = 0; i < n; i++)
        {
            Thread1 t1 = new Thread1();
            t1.start();
            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}
