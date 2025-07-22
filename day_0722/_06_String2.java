package day_0722;

public class _06_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";


        // 문자열 반환
        System.out.println(s.replace("and",",")); // and를 콤마로 변환
        System.out.println(s.substring(7)); // 인덱스 7부터 문자열 추출
        System.out.println(s.substring(s.indexOf("Java"))); // Java의 인덱스를 추출 후 그 인덱스 부터 문자열 추출
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // Java의 인덱스부터 .인덱스 까지 문자열 추출

        // 변수에 넣어서 사용
        String java_cut = s. substring(7);
        System.out.println(java_cut);

        // 공백 제거
        s= "        I love you.      ";
        System.out.println(s.trim()); // 양옆 여백 공백제거

        // 문자열 결합
        String s1 = "I love ";
        String s2= "you";
        System.out.println(s1.concat(s2));
    }
}
