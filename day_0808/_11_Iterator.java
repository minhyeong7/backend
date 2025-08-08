package day_0808;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _11_Iterator {
    public static void main(String[] args) {
        // 이터레이터


        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알 수 없음");
        list.add("김종국");
        list.add("알 수 없음");
        list.add("강호동");
        list.add("알 수 없음");
        list.add("박명수");
        list.add("알 수 없음");
        list.add("조세호");


        for (String s :list){
            System.out.println(s);
        }

        System.out.println("------------------------");
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-------------------");

        it = list.iterator(); // 커서를 앞으로 이동
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------");
        it = list.iterator();
        while(it.hasNext()){
            String s =it.next();
            if(s.contains("알 수 없음")){
                it.remove();
            }
        }

        it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
