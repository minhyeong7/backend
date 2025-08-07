package day_0807;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _14_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try{
            int[] cards = {4,5,1,2,7,8};
            System.out.println("몇 번째 카드를 뽑으시겠습니까? >>");
            int cardIndex = scan.nextInt();
            System.out.println("뽑은 카드 번호 : " +cards[cardIndex]);

        }catch (Exception e){
            System.out.println("예외 클래스"+e.getClass().getName());
        }

        System.out.println("프로그램 종료");
        scan.close();



    }
}
