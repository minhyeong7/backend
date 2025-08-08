package day_0808;

import java.util.HashMap;
import java.util.Map;

public class _09_HashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("spring","봄");
        map.put("summer","여름");
        map.put("fall","가을");
        map.put("winter", "겨울");

        map.put("spring","용수철");
        map.put("autumn","용수철");

        System.out.println(map);

        map.remove("autumn");

        System.out.println(map);

        // 특정 키가 존재하는지
        System.out.println(map.containsKey("spring"));
        // 특정 밸류가 존재하는지
        System.out.println(map.containsValue("여름"));
        // key에 해당하는 값 불러오기
        System.out.println(map.get("summer"));

        // 전체 삭제
        map.clear();
        if(map.isEmpty()){
            System.out.println("남은 데이터 수 :" +map.size());
        }

        System.out.println("----------------------------------------");

        map.put("조이","액터");
        map.put("챈들러","회사원");
        map.put("로스","교수");
        map.put("레이첼", "디자이너");
        map.put("모니카","요리사");
        map.put("파비","마사지사");


        System.out.println(map);

        // key 값 확인
        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("---------------------------");
        // value 값 확인
        for(String value : map.values()){
            System.out.println(value);

        }
        System.out.println("---------------------------");

        // 키,밸류 뽑기
        for(String key : map.keySet()){
            System.out.println("이름 :"+key+ "\t\t직업 :"+map.get(key));
        }


    }
}
