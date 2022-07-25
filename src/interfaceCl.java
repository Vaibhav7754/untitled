
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK();
    void blowHornn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Horn sound");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK(){
        System.out.println("Horn Ok");
    }
    public void blowHornn(){
        System.out.println("Horn Horn");
    }
}
public class interfaceCl {
    public static void main(String[] args) {
        AvonCycle Vaibhav = new AvonCycle();
        Vaibhav.applyBrake(1);


        // You can create properties in Interfaces
        System.out.println(Vaibhav.a);
        System.out.println(Vaibhav.x);




        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);

        Vaibhav.blowHornK();
        Vaibhav.blowHornn();
        Vaibhav.speedUp(1);
    }
}

