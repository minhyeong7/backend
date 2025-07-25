package day_0724.ClassBlackbox;

public class _08_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1= new BlackBox();
        b1.modelName = "까망이";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사 ~~~
        b1.price= -5000;
        System.out.println("가격: "+ b1.price+"원");

    }
}
