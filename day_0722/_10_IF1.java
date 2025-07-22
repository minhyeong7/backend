package day_0722;

import java.util.Scanner;

public class _10_IF1 {
    public static void main(String[] args) {
        int result = 0;
        if(3>2){
            result =3;
        }
        System.out.println(result);

        Scanner sc = new Scanner(System.in);

        int age= sc.nextInt();
        if(age>=19){
            System.out.println("성인");
        }
        System.out.println("종료");
    }
}
