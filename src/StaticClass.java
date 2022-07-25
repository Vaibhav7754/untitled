class outerclass{
    static class inner_b{
        public void m1(){
            System.out.println("Static nested class method");
        }
    }

}
public class StaticClass {
    public static void main(String[] args) {
        outerclass.inner_b oi = new outerclass.inner_b();
        oi.m1();
    }
}
