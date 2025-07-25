package day_0724.ClassBlackbox;

public class _04_MethodOverroading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.modelName = "까망이";

        b1.record(false,false,10);

        System.out.println("----------------------------------------");

        b1.record(true,false,5);

        System.out.println("----------------------------------------");

        b1.record(false,true,10);

        b1.record();





    }
}
