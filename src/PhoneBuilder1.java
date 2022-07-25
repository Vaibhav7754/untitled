public class PhoneBuilder1 {
    private String os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public PhoneBuilder1 setOs(String os) {
        this.os = os;
        return this;

    }

    public PhoneBuilder1 setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder1 setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder1 setScreensize(double screensize) {
        this.screensize = screensize;
        return this;
    }

    public PhoneBuilder1 setBattery(int battery) {
        this.battery = battery;
        return this;

    }
    public PhoneBuilder getPhone(){
        return new PhoneBuilder(os,ram,processor,screensize,battery);
    }

    public static void main(String[] args) {
        PhoneBuilder pb = new PhoneBuilder1().setOs("IOS").getPhone();
        System.out.println(pb);

    }
}
