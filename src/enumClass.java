enum Color{
    RED("red"), GREEN("green"), BLUE("blue");
    private String value;
    Color(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
public class enumClass {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Red emum name: "+c1.name());
        System.out.println("Red enum value: "+c1.getValue());
        for (Color color: Color.values()){
            System.out.println("Enum Values: "+ color.getValue());
        }
    }
}
