import java.lang.reflect.Method;

public class Myclass {
    @annotation(value = 10)
    public void SayHello(){
        System.out.println("My Custom Annotation");
    }

    public static void main(String[] args) throws Exception {
        Myclass h = new Myclass();
        Method methodVal = h.getClass().getMethod("SayHello");
        annotation myCustomAnnotation = methodVal.getAnnotation(annotation.class);
        System.out.println("Value is: " + myCustomAnnotation.value());

    }
}
