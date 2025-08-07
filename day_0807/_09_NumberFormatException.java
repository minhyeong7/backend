package day_0807;

//잘못된 문자열을 정수형으로 파싱할때 발생

public class _09_NumberFormatException {
    public static void main(String[] args) {
        String str01 ="11";
        String str02 ="11.2";

        int num01=Integer.parseInt(str01);

        System.out.println("String to int : " +num01);

        int num02=Integer.parseInt(str02);
        System.out.println("String to int : "+ num02);


    }



}
