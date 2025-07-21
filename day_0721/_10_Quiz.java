package day_0721;

import java.util.Scanner;

public class _10_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("무슨 언어를 배우나요?");
        String str1= sc.next();
        sc.nextLine();

        System.out.println("배우니 어떤가요?");
        String str2= sc.nextLine();

        System.out.println(str1+"를 배우니는"+ str2+"합니다.");

    }
}
