class Thread11 extends Thread{
    MathUtils mu;
    public Thread11(MathUtils mu){
        this.mu = mu;

    }



    @Override
    public void run() {
        try {
            mu.getMultiples(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Thread22 implements Runnable{
    MathUtils mu;
    public Thread22(MathUtils mu){
        this.mu = mu;

    }

    @Override
    public void run() {
        try {
            mu.getMultiples(3);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MathUtils{
    void getMultiples(int n){
        synchronized (this){
            for (int i = 1; i<=5; i++){
                System.out.println(n * i);
                try{
                    Thread.sleep(400);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }

}

public class Synchronize {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();
        Thread11 t1 = new Thread11(obj);
        Thread t2 = new Thread(new Thread22(obj));
        t1.start();
        t2.start();
    }
}
