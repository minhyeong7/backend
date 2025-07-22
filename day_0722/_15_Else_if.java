package day_0722;

import java.util.Scanner;

public class _15_Else_if {
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);

        int age=num.nextInt();


        if(age >19){
            System.out.println("성인");
        }else if(age>13){
            System.out.println("청소년");
        }else if(age>6){
            System.out.println("어린이");
        }else{
            System.out.println("유아");
        }
    }
}
