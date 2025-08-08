package day_0808;

import java.util.LinkedList;

public class _06_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("레이첼");
        list.add("파비");
        list.add("모니카");
        list.add("조이");
        list.add("챈들러");
        list.add("로스");

        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("----------------------------------");

        list.addFirst("마이크");
        System.out.println(list);


        System.out.println("-------------------------------");
        System.out.println("1번에 지정 추가");
        list.add(1,"제니스");
        System.out.println(list);

        // 삭제
        System.out.println("----------------------------");
        list.remove(4);
        System.out.println(list);


        // 처음 학생과 마지막 학생 전학
        System.out.println("-------------두명 전학--------------");
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 학생 수:"+list.size());


        // set indexOf contains clear isEmpty Collections.sort()






    }
}
