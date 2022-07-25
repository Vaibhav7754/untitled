import java.util.Scanner;

public class except {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to divide");

                int a = sc.nextInt();
                int b = 600;
             try {
                int c = b / a;
                System.out.println("The result is: " + c);
            }
            catch (Exception e){
                System.out.println("We got the error: "+e);


            }


    }
}
