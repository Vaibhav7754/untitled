class Employee{
    private int id;
    private String name;
    public Employee(){
        id = 45;
        name = "Your-Name-Here";

    }

    public String getName() {

        return name;
    }
    public void setName (String n) {

        name = n;
    }
    public void setId(int i) {

        id = i;
    }
    public int getId() {

        return id;
    }
}
public class privateEmp {
    public static void main(String[] args) {
        Employee Vaibhav = new Employee();
        Vaibhav.setName("I am Vaibhav");
        Vaibhav.setId(34);
        System.out.println(Vaibhav.getId());
        System.out.println(Vaibhav.getName());

    }
}