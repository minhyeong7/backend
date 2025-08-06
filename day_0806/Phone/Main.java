package day_0806.Phone;

public class Main {
    public static void main(String[] args) {
        PineApplePhone pp=new PineApplePhone();

        pp.powerOn();
        pp.powerOff();


        System.out.println("-------------------------");
        Phone tp = new ThreeStarPhone();

        tp.powerOn();
        tp.powerOff();
    }
}
