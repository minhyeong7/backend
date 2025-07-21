package day_0721;

import java.util.Scanner;

public class _08_Scanner {
    public static void main(String[] args) {
        // int age =32;

        Scanner sc = new Scanner(System.in);
//
//        System.out.printf("나이를 입력해 주세요:");
//        int age = sc.nextInt();
//        System.out.printf("내 나이는 %d세 입니다.", age);
//
        String name, address;
        int age;
        double height;

        System.out.println("이름, 주소, 나이, 키를 띄어쓰기로 입력하시오 (엔터아님)");
        name =sc.next();
        address = sc.next();
        age = sc.nextInt();
        height = sc.nextDouble();

        System.out.printf("제 이름은 %s 입니다.%n", name);
        System.out.printf("제 주소는 %s 입니다.%n", address);
        System.out.printf("제 나이는 %d 입니다.%n", age);
        System.out.printf("제 키는 %.1f cm입니다.%n", height);


    }
}
