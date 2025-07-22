package day_0722;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.printf("숫자 입력:");
        int a=num.nextInt();
        int b=num.nextInt();


        String result =a>b ? "a가 크다":"b가크다";
        System.out.println(result);

        String result2= a>b ? "a가 크다" : a<b ? "b가크다" : "둘이 같다";
        System.out.println(result2);

    }
}
