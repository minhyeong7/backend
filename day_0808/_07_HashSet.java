package day_0808;

import java.util.HashSet;

public class _07_HashSet {
    public static void main(String[] args) {
        //세트
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("야채");
        set.add("소금");
        set.add("삼겹살");
        set.add("후추");
        set.add("버섯");

        System.out.println("총 구매 상품 수 :" +set.size());
        System.out.println("구매 리스트 :" + set);

        // 확인
        if(set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발!");
        }
        System.out.println("--------------------------------");

        // 삭제

        System.out.println("목록 수 (삽겹살 구매전):"+set.size());
        set.remove("삽겹살");
        System.out.println("목록 수 (삽겹살 구매후):"+set.size());

        System.out.println("--------------------------------");

        // 전체삭제
        set.clear();
        if(set.isEmpty()){
            System.out.println("남은 목록 :"+set.size());
        }

        // 셋 - 중복허용 X, 순서 보장 X

        HashSet<Integer> inSet = new HashSet<>();
        inSet.add(1);
        inSet.add(13);
        inSet.add(2);
        inSet.add(8);
        inSet.add(4);

        System.out.println(inSet);




    }
}
