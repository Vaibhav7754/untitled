public class PhoneBuilder {
    private String Os;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "Os='" + Os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screensize=" + screensize +
                ", battery=" + battery +
                '}';
    }

    public PhoneBuilder(String Os, int ram, String processor, double screensize, int battery) {
        this.Os = Os;
        this.ram = ram;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;

    }

    public static void main(String[] args) {
        PhoneBuilder p = new PhoneBuilder("IOS",2,"mediatek",12.5,3000);
        System.out.println(p);

    }
}
