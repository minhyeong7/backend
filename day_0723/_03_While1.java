package day_0723;

public class _03_While1 {
    public static void main(String[] args) {
        int sum =0;
        int i=1;

        while(i<=10){
            System.out.println("식사는 하셨습니까");
            sum+=i;
            i++;
        }
        System.out.println(sum);

    }
}
