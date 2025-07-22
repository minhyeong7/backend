package day_0722;

public class _11_IF2 {
    public static void main(String[] args) {
        int hour=14;
        boolean morningCoffee = false; // 모닝커피


        if(hour >17 || morningCoffee == true){
            System.out.println("커피를 마시지 않겠습니다.");
        }
        if(hour <17 && morningCoffee){
            System.out.println("커피를 마시겠습니다");
        }
    }
}
