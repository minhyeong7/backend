package day_0721;

public class _03_variable2 {
    public static void main(String[] args) {
        int myAge = 20;
        int yourAge= 30;
        int ourAge;

        ourAge=myAge;
        myAge = yourAge;
        yourAge = ourAge;

        System.out.println(myAge);
        System.out.println(yourAge);


    }
}
