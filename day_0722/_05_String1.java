package day_0722;

import java.util.Locale;

public class _05_String1 {
    public static void main(String[] args) {
        String s ="I like Java and Python and C.";

        System.out.println(s.length()); // 문자열 길이

        System.out.println(s.toUpperCase()); // 대문자 출력
        System.out.println(s.toLowerCase()); // 소문자 출력

        System.out.println(s.contains("Java")); // true 해당 값 있으면 true
        System.out.println(s.contains("C#")); // false

        System.out.println(s.indexOf("Java")); // 7   인덱스 위치 추출 처음 기준
        System.out.println(s.lastIndexOf("and")); // 마지막 기준
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith(" ")); //true




    }
}
