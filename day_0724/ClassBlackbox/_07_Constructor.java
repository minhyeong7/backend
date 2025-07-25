package day_0724.ClassBlackbox;

public class _07_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("-------------------------------");


        BlackBox b6= new BlackBox("핑킁이","UHD",300000,"부농");

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        System.out.println(b1.serialNumber);
        System.out.println();
        System.out.println(BlackBox.counter);




    }
}
