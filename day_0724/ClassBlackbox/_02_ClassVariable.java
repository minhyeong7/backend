package day_0724.ClassBlackbox;

public class _02_ClassVariable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        BlackBox b2 = new BlackBox();

        b1.modelName = "까망이";
        b2.modelName = "하양이";

        System.out.println(b1.modelName);
        System.out.println(b2.modelName);

        System.out.println(" - 개발전 -");
        System.out.println(b1.modelName + "자동 신고기능 :" + b1.conAutoReport);
        System.out.println(BlackBox.conAutoReport);

        System.out.println("개발 후");
        BlackBox.conAutoReport=true;
        System.out.println(b1.modelName + "자동 신고기능 :" + b1.conAutoReport);
        System.out.println(BlackBox.conAutoReport);


    }
}
