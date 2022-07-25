import java.util.Scanner;
public class inp {
    public static void main(String[] args) {
        System.out.println("This is the sum");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
