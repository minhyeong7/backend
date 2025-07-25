package myGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int game_button;
        Scanner sc=new Scanner(System.in);
        System.out.println("버튼을 누르세요(게임 시작(1),게임 종료(0))");
        int start_end_button=sc.nextInt();

       switch (start_end_button){
           case 0:
               break;

           case 1:
               System.out.println("두더지 잡기 게임 시작!");
               while(true){
                   System.out.println("두더지를 몇마리 생성하시겠습니까?(최소 3마리 최대 6마리, 0입력시 게임종료))");
                   game_button= sc.nextInt();
                   if(game_button==0){
                       break;
                   }else if(game_button >= 3 && game_button <= 6){

                       Mole mole=new Mole(game_button);
                       while(true){
                           System.out.println("다음 두더지는 어디에 있습니까(ex:3마리면 1~3번 버튼)?");
                           game_button= sc.nextInt();
                           if(game_button==mole.random_mole){
                               System.out.println("두더지를 잡았습니다");
                               break;
                           }else{
                               System.out.println("두더지를 잡지못해 재배치 됩니다");
                               mole.setRandom_mole();
                           }
                       }


                   }else{
                       System.out.println("버튼 잘못 입력");
                   }


               }


       }

        System.out.println("게임이 종료 되었습니다");
    }
}
