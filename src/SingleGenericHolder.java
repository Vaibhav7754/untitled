public class SingleGenericHolder<T> {
    T obj;
    SingleGenericHolder(T obj){
        this.obj = obj;
    }
    public T getObject(){
        return this.obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> iobj = new SingleGenericHolder<Integer>(10);
        System.out.println(iobj.getObject());
        SingleGenericHolder<String> sobj = new SingleGenericHolder<String>("VBCode");
        System.out.println(sobj.getObject());
    }

}
