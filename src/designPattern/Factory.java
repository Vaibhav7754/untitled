package designPattern;
class Android implements OS{
    public void specs(){
        System.out.println("Most Powerful OS");

    }

        }
class IOS implements OS {
    public void specs() {
        System.out.println("Most Secure OS");
    }
}
class windows implements OS{
            public void specs(){
                System.out.println("I am about to die");
            }

}
class OperatingSystemFactory{
    public OS getInstance(String str){
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closed"))
            return new IOS();
        else
            return new windows();
    }
}


public class Factory {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Closed");
        obj.specs();
//        OS obj = new Android();
//        obj.specs();
//        OS ob = new windows();
//        ob.specs();


    }
}
