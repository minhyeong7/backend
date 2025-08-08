package day_0808;

import java.util.ArrayList;
import  java.util.List;

public class _03_ArrayList3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++){

            int temp=(int)(Math.random()*30) +1;
            list.add(temp);

        }
        System.out.println("전체 데이터: " + list);
//        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                System.out.println(list.get(i));
            }
        }


    }
}
