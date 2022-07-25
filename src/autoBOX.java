import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class autoBOX {
    public static void main(String[] args) {
        int i = 10;
        //Autobox
        Integer iobj = Integer.valueOf(i);
        System.out.println("Value of integer iobj \n"+ iobj);
        //auto-UNBOX
        int i1 = iobj;
        System.out.println("Value of int \n"+i1);
        Character charobj = 'a';
        char ch = charobj;
        System.out.println("Value of charobj: \n"+ charobj);
        System.out.println("Value of ch: \n"+ch);


        List<Integer> values = Arrays.asList(3,4,5,6,10,20,30);
        System.out.println(values.stream().map(c->c*c).filter(c->c%5==0).collect(Collectors.toList()));


    }
}
