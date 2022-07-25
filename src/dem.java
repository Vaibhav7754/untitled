

//class Demo{
//    public boolean flag;
//}
//public class dem {
//    public static void main(String[] args) {
//        Demo test = new Demo();
//        System.out.println(test.flag);
//    }
//}
//public class dem {
//    public boolean checkTemp(int temp){
//        if (temp>100){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        dem tester = new dem();
//        if(tester.checkTemp(110)){
//            System.out.println("Data is valid");
//        }
//        else{
//            System.out.println("Data is invalid");
//        }
//
//    }
//}

//public class dem {
//
//
//    public int substract(int a,int b){
//        return (a - b);
//
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        dem test = new dem();
//        int res = test.substract(b,a);
//        System.out.println(res);
//        int[] myArray5 = new int[5];
//    }
//}

public class dem {
    public int num1;
    public int num2;
    dem(int num1,int num2){
        num1 = num1;
        num2 = num2;
    }

    public static void main(String[] args) {
        dem teste = new dem(20,40);
        System.out.println(teste.num1);
        System.out.println(teste.num2);

    }

}