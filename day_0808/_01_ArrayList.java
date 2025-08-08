package day_0808;

import java.util.ArrayList;
import java.util.List;

public class _01_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("딸기");
        list.add("바나나");
        list.add("망고");

        System.out.println("리스트 내용1 :" +list);

        list.add(2,"수박"); // 해당 인덱스 자리에 요소 넣기
        System.out.println(list);

        // 해당 자리 인덱스에 요소 바꾸기
        list.set(1,"복숭아");
        list.set(0, "파인애플");

        System.out.println(list);
    }
}
