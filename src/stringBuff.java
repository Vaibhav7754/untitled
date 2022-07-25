public class stringBuff {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java

        //Insert Method
        StringBuffer sbf=new StringBuffer("Hello ");
        sbf.insert(1,"Java");//now original string is changed
        System.out.println(sbf);//prints HJavaello

        //3) StringBuffer replace() Method
        StringBuffer re=new StringBuffer("Hello");
        re.replace(1,3,"Java");
        System.out.println(re);//prints HJavalo

        //StringBuffer delete() Method
        StringBuffer del=new StringBuffer("Hello");
        del.delete(1,3);
        System.out.println(del);//prints Hlo

        //5) StringBuffer reverse() Method
        StringBuffer rev=new StringBuffer("Hello");
        rev.reverse();
        System.out.println(rev);//prints olleH
    }
}
