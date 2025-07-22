package day_0722;

import java.util.Scanner;

public class _19_swtich3 {
    public static void main(String[] args) {
      Scanner num=new Scanner(System.in);

      int hour=num.nextInt();
      String str=num.next();
      int fee=0;
      int max=30000;

      if(str.equals("경차")){
          fee= (int) (hour*4000);
          if(fee>max){
              fee=max;
          }
          fee*=0.5;
      }else if(str.equals("장애인")){
          fee= (int) (hour*4000);
          if(fee>max){
              fee=max;
          }
          fee*=0.5;
      }else{
          fee= (int) (hour*4000);
          if(fee>max){
              fee=max;
          }
    }

        System.out.println("최종요금:"+fee);
    }
}
