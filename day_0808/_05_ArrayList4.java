package day_0808;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _05_ArrayList4 {
    public static void main(String[] args) {
        int[] array =new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] =3;

        // 간단하다, 단순하다, 크기가 정해져서 불편하다 - > 컬렉션 프레임워크로 해결

        // 컬렉션 프레임워크 (List,Set,Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가 add
        list.add("홍길동");
        list.add("박명수");
        list.add("정형돈");
        list.add("강호동");
        list.add("김종국");

        // 데이터 조회 get (인덱스 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-----------------------");

        // 데이터 삭제  remove
        System.out.println("신청 학생 수 : " + list.size());

        list.remove("박명수");
        System.out.println("남은 학생수 :" +list.size());
        System.out.println("인덱스 1은?"+list.get(1));


        System.out.println("--------------------------------");

        list.remove(list.size()-1);
        System.out.println(list.size());


        System.out.println("--------------------------------");

        for (String s : list){
            System.out.println(s);
        }


        System.out.println("전체 학생 :"+list);

        // 변경
        System.out.println("수강권 양도전 : "+ list.get(0));
        list.set(0,"이수근");
        System.out.println("수강권 양도후 :" + list.get(0));

        // 확인 indexOf contains
        System.out.println("정형돈 인덱스 위치:"+list.indexOf("정형돈"));

        // 정형돈 포함여부
        if(list.contains("정형돈")){
            System.out.println("정형돈 있음");
        }else{
            System.out.println("정형돈 없음");
        }


        System.out.println("---------------------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("리스트가 비었습니다");
            System.out.println("리스트 사이즈는"+list.size());
        }

        System.out.println("----------------------------");
        // 다음 학기에 새로 공부를 시작
        list.add("레이첼");
        list.add("파비");
        list.add("모니카");
        list.add("조이");
        list.add("챈들러");
        list.add("로스");


        System.out.println("전체 학생 ="+list);

        // 가나다 순으로 정렬
        Collections.sort(list);
        System.out.println("정렬 후 ="+ list);






    }
}
