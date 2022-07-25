abstract class Bike{
    abstract void run();
}
class ola extends Bike{
    void run(){
        System.out.println("This is electric bike");

    }


}

public class abstract1 {
    public static void main(String[] args) {


        ola o1 = new ola();
        o1.run();

    }
}
