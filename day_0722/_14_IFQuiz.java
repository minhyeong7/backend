package day_0722;

import java.util.Scanner;

public class _14_IFQuiz {
    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);
        int age=num.nextInt();

        if(age>=19){
            System.out.println("성인");
        }else{
            System.out.println("미성년자");
        }
    }
}
