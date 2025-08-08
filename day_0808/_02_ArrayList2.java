package day_0808;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayList2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<10; i++){
            int temp = 2*i;
            list.add(temp);

        }

        System.out.println(list);
        //해당 인덱스 자리 삭제
        list.remove(3);

        System.out.println(list );

        //10을 찾아서 삭제
        list.remove(Integer.valueOf(10));




    }





}
