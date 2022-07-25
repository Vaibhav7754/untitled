class ParentClass{
    class ChildClass{
        public void print(){
            System.out.println("This is child of parent");
        }
    }

}
public class Nested_class {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        ParentClass.ChildClass C = p.new ChildClass();
        C.print();
    }
}
