package day_0725;
import java.util.Random;
public class _01_Random {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("랜덤 정수:" + random.nextInt());
        System.out.println("랜덤 정수 (범위 10): "+random.nextInt(3)); // 0이상 10미만
        System.out.println("랜덤 실수: "+random.nextDouble()); // 0.0이상 1.0미만 실수


        System.out.println(random.nextDouble(5,10));
        System.out.println(random.nextDouble()*5+5); // 5.0이상 10.0 미만 실수 뽑기

        //로또 번호 1~45
        System.out.println(random.nextInt(45)+1);
    }
}
