package day_0722;

public class _09_Quiz {
    public static void main(String[] args) {
        String jumin="901232-1234567";


        String birth=jumin.substring(2,6);
        String numgender=jumin.substring(7,8);
        String gender=numgender.equals("1") ? "M" : "F";

        System.out.println("생일은"+birth+"이고 성별은"+gender+"입니다");

    }
}
