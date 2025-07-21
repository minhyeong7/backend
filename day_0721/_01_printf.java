package day_0721;

public class _01_printf {
    public static void main(String[] args) {
        System.out.printf("저는 대학교 %d학년에 재학중입니다.",3);
        System.out.println();

        System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세 번째",1,2.0,"셋");
        System.out.println();
        System.out.printf("%5d", 12);
        System.out.println();
        System.out.printf("%5d",123);
        System.out.println();
        System.out.printf("%5d",1234);
        System.out.println();
        System.out.printf("%5d", 12345);
        System.out.println();
        System.out.printf("%.1f",1.23456);
        System.out.println();
        System.out.printf("%.2f",1.23456);
        System.out.println();
        System.out.printf("%.3f",1.234567);
        System.out.println();

    }
}
