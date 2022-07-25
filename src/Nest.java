class A1{
    class B1{
        public void inner_n(){
            System.out.println("Its an inner class");

        }
        public void printSomething(String str){
            System.out.println("Inner class msg from main method"+ str);
        }
    }
    public void printSomething(String msg){
        System.out.println("Outer class msg from main method"+ msg);
    }

        }

public class Nest {
    public static void main(String[] args) {
        A1 a = new A1();
        a.printSomething("messgae from outer class");
        A1.B1 b = a.new B1();
        b.inner_n();
        b.printSomething("Message for inner class");
    }
}
