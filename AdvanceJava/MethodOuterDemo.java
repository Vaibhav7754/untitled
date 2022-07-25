package AdvanceJava;

class methodDemo {
    public void m1(){
        class innerclass{
            public void sum(int x, int y){
                System.out.println("Sum of two numbers = "+ (x + y));
            }
        }
        innerclass ic = new innerclass();
        ic.sum(2,3);
        ic.sum(5,4);
        ic.sum(10,15);
        ic.sum(20,25);
        ic.sum(10,12);

    }
}
public class MethodOuterDemo{
    public static void main(String[] args) {
        methodDemo md = new methodDemo();
        md.m1();

    }

}
