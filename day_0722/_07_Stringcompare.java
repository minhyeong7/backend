package day_0722;

public class _07_Stringcompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1= "Java";
        String s2="Python";

        System.out.println(s1.equals(s2)); // 내용이 값으면 true 아니면 false
        System.out.println(s1.equals("Java")); // 내용이 같다 true
        System.out.println(s2.equals("python")); // 대소문자 구분한다 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 무시 true

        // 비교 심화 버전
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); // true
        System.out.println();

        s1 = new String("1234");
        s2= new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); // false

        // equlase => 내용 비교
        // == => 주소 비교
    }
}
