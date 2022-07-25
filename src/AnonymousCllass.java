class college{
    public void collegeName(String name){

        System.out.println("The college name is "+ name);

    }
}
public class AnonymousCllass {
    public static void main(String[] args) {
        college c2 = new college();
        c2.collegeName("IIT College");

        college c1 = new college(){
            @Override
            public void collegeName(String name){
                System.out.println("This is engineering college= "+name);
            }
        };
        c1.collegeName("COEP");
    }

}
