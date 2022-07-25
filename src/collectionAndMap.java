import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class collectionAndMap {
    public static void main(String[] args) {
        //List
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add("My name is Vaibhav");
        System.out.println(l1);
        //Set
        HashSet hs = new HashSet();
        hs.add(20);
        hs.add("This is hashset");
        System.out.println(hs);
        // In hashmap we use key : value pair and use keyword put to add values
        HashMap hm = new HashMap();
        hm.put(101,"raj");
        hm.put(102,"ryan");
        System.out.println(hm);

        //Linked List


                LinkedList<String> name = new LinkedList<>();


                name.add("Raj");
                name.add("Sourabh");
                name.add("Ramesh");
                System.out.println("LinkedList: " + name);
                name.add(1,"Vaibhav");
                System.out.println("Updated list"+ name);
            }
        }

