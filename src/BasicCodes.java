import java.util.Arrays;

public class BasicCodes {
    public static void main(String[] args) {


//    int num = 370, number, temp = 0, total = 0;
//
//
//    number = num;
//        while (number != 0)
//    {
//        temp = number % 10;
//
//        total =  total + temp*temp*temp;
//
//        number /= 10;
//    }

// For LOOP
//        for(;number!=0;number/=10){
//            temp = number % 10;
//            total = total + temp*temp*temp;
//        }
//
//
//        if(total == num)
//            System.out.println(num + " is an Armstrong number");
//        else
//                System.out.println(num + " is not an Armstrong number");
//        int n = 33;
//        if(n%2==0){
//            System.out.println("This is even number");
//        }
//        else{
//            System.out.println("Odd number");
//        }

        int[] arr = {1,4,5,9,8,7,5,8};
        System.out.println(Arrays.stream(arr).max());
}
}
