package day_0724.ClassBlackbox;

public class _01_InstanceVariable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        BlackBox b2= new BlackBox();
        b1.modelName = "까망이";
        b1.resolution="FHD";
        b1.price= 200000;
        b1.color = "블랙";

        b2.modelName = "하양이";
        b2.resolution="UHD";
        b2.price= 300000;
        b2.color = "화이트";



        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}
