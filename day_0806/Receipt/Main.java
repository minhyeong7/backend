package day_0806.Receipt;

public class Main {
    public static void main(String[] args) {
        // Receipt r = new Receipt();  추상 클래스는 직접 객체 생성 안됨.

        PastaReceipt pr =new PastaReceipt("최연석");
        pr.info();
        pr.makeSource();

        System.out.println("------------------------");

        StakeReceipt sr= new StakeReceipt("이연복");
        sr.info();
        sr.grillStake();


    }
}
