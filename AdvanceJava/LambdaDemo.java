package AdvanceJava;
interface X{
    void show(int i);

}
//class A1 implements X{
//    public void show(){
//        System.out.println("Hello");
//    }
//}


public class LambdaDemo {
    public static void main(String[] args) {

//        X obj = new X(){
//            public void show(){
//                System.out.println("Hi");
//            }


//        };
        X obj;
        obj = (i) -> System.out.println("Hi this is lambda class"+ i);
        obj.show(2);
    }
}
