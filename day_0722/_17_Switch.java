package day_0722;

import java.util.Scanner;

public class _17_Switch {
    public static void main(String[] args) {
        int num =7;

        switch (num){
            case 1:
                System.out.println("숫자1");
                break;


            case 2:
                System.out.println("숫자2");
                break;


            default:
                System.out.println("숫자  1 숫자2 둘다 아님");


        }

        System.out.println("숫자입력");
        Scanner sc = new Scanner(System.in);

        num= sc.nextInt();

        switch (num){
            case 1:
                System.out.println("숫자1");
                break;
            case 2:
                System.out.println("숫자2");
                break;
            case 3:
                System.out.println("숫자3");
                break;
            case 4:
                System.out.println("숫자4");
                break;
            case 5:
                System.out.println("숫자5");
                break;
        }
    }
}
