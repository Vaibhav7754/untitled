public class overload {
    static void cal() {
        System.out.println("This is sum");
    }

    static void cal(int a,int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }

    static void cal(int a, int b,int c) {
        int d;
        d = (a + b) * c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        cal();
        cal(10, 12);
        cal(22,23,34);

    }
}
