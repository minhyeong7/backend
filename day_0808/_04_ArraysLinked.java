package day_0808;

import java.util.ArrayList;
import java.util.LinkedList;

public class _04_ArraysLinked {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // ArrayList 연속적으로 데이터 추가
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("ArrayList 추가시간 : "+ duration);

        // LinkedList 연속적으로 데이터 추가
        startTime = System.nanoTime();
        for (int i = 0; i <1000000 ; i++) {
            linkedList.add(i);
        }

        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 추가시간 : "+ duration);


        // ArrayList 선택적삽입
        startTime = System.nanoTime();
        arrayList.add(99,100);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList 삽입 시간 : "+ duration);

         //LinkedList 선택적삽입
        startTime = System.nanoTime();
        linkedList.add(99,100);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 삽입 시간 : "+ duration);

        // ArrayList 지우기
        startTime = System.nanoTime();
        for (int i = 9999; i >=0 ; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList 지운 시간 : "+ duration);


        // LinkedList 지우기
        startTime = System.nanoTime();
        for (int i = 9999; i >=0 ; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 지운 시간 : "+ duration);
    }
}
