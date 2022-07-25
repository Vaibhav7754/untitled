public class stringMeth {
    public static void main(String[] args) {

                String name="javatpoint";
                char ch=name.charAt(4);//returns the char value at the 4th index
                System.out.println(ch);
        String s1="java string";
// The string s1 does not get changed, even though it is invoking the method
// concat(), as it is immutable. Therefore, the explicit assignment is required here.
        s1.concat("is immutable");
        System.out.println(s1);
        s1=s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
        String name1="what do you know about me";
        System.out.println(name1.contains("do you know"));
        System.out.println(name1.contains("about"));
        System.out.println(name1.contains("hello"));
        String s2="java by javatpoint";
        System.out.println(s2.endsWith("t"));
        System.out.println(s2.endsWith("point"));


        //EQUALS
        String b1="javatpoint";
        String b2="javatpoint";
        String b3="JAVATPOINT";
        String b4="python";
        System.out.println(b1.equals(b2));//true because content and case is same
        System.out.println(b1.equals(b3));//false because case is not same
        System.out.println(b1.equals(b4));//false because content is not same

        //equals ignore case
        String c1="javatpoint";
        String c2="javatpoint";
        String c3="JAVATPOINT";
        String c4="python";
        System.out.println(c1.equalsIgnoreCase(c2));//true because content and case both are same
        System.out.println(c1.equalsIgnoreCase(c3));//true because case is ignored
        System.out.println(c1.equalsIgnoreCase(c4));//false because content is not same

        //String Format
        String namef="sonoo";
        String sf1=String.format("name is %s",namef);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

        //replace
        String d1="javatpoint is a very good website";
        String replaceString=d1.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);
    }
    }

