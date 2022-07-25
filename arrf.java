public class arrf {
    static int logic(int x, int y){
        int z;
        if(x> y){
            z = x+y;

        }
        else{
            z = (x+y)*5;
        }
        return z;

    }
    public static void main(String[] args) {
//        int[] marks = new int[5];
//        marks[0] = 80;
//        marks[1] = 70;
//        marks[2] = 90;
//        marks[3] = 95;
//        marks[4] = 75;
//        System.out.println(marks[4]);
//        There are three ways to create arrays in java
//        int[] marks;
//        marks = new int[5];
//        3rd way:
//        int[] marks = {80,60,76,87,76};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//        String[] students = {"roj", "raj", "jasmine", "rihan", "Ali"};
//        System.out.println(students[2]);
//        for(int elements: marks){
//            System.out.println(elements);
//        }
//        for(int i = 0; i<marks.length; i++ )
//            System.out.println(marks[i]);
        int c;
        int a = 10;
        int b = 20;
        c = logic(a, b);
        System.out.println(c);

    }
}
