package day_0723;

public class _05_Continue {
    public static void main(String[] args) {
        int sum =0;

        for (int i = 0; i < 100; i++) {

            if(i % 2 !=0){
                continue;
            }

            sum+=i;
        }

        System.out.println("짝수의 합:" + sum);
    }
}
