public class takeInput {
    static void change(int[] arr){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        int[] marks = {22,33,44,55,66};
        change(marks);
        System.out.println(marks[0]);


    }
}
