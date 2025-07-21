package day_0721;

public class _15_Operator5 {
    public static void main(String[] args) {
//        조건 연산자
//        조건식 ? 피연산자1 : 피연산자2   참(피연산자1)   거짓(피연산자2)
        int num = (7 > 1) ? 1 : 2 ;
        System.out.println(num);

        int x = 5;
        int y = 3;

        int max= (x>y ) ? x: y ;
        System.out.println(max);

        int min=(x>y) ?y :x;
        System.out.println(min);

        int height=130;
        System.out.println(height>120 ? "탑승가능" : "탑승 불가");


    }
}
