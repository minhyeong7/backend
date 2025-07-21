package day_0721;

public class _012_out {
    public static void main(String[] args) {
        System.out.println("------------정수--------------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%6d%n",1234);
        System.out.printf("%6d%n",-1234);
        System.out.printf("%,12d%n",3000000);
        System.out.printf("%-6d%n",1234);

        System.out.println("------------실수-------------");
        System.out.printf("%f%n",Math.PI);
        System.out.printf("%6.2f%n",Math.PI);
        System.out.printf("%-6.2f%n",Math.PI);
        System.out.printf("%06.2f%n",Math.PI);
        System.out.printf("%+6.2f%n",Math.PI);


        System.out.println("------------문자열-------------");
        System.out.printf("%6s%n","Java");
        System.out.printf("%-6s%n","Java");
        System.out.printf("%6.2s%n","Java");
        System.out.printf("%-6s%n","Java");


        System.out.println("------------응용-------------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("나루토 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("사스케 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("사쿠라 " + 95 + " " + 100 + " " + 97.5);


        System.out.println("------------응용2-------------");
        System.out.println("이름     영어  수학  평균"); // 공백 6, 3, 3 칸
        System.out.printf("나루토 %6d %3d %5.1f%n",90,80,85.0);
        System.out.printf("사스케 %6d %3d %5.1f%n",100,100,100.0);
        System.out.printf("사쿠라 %6d %3d %5.1f%n",95,100,97.5);










    }
}
