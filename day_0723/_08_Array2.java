package day_0723;

public class _08_Array2 {
    public static void main(String[] args) {


        int [] numbers = new int[10];
        int sum;
        int count=0;

        while (true ){
            count++;
            sum=0;
            for (int i=0; i<numbers.length; i++){
                numbers[i] = (int)(Math.random() *30)+1;
            }

            for (int i=0; i<numbers.length; i++){
                if (numbers[i]%2==0){
                    sum+=numbers[i];

                }
            }
            for (int i=0; i<numbers.length; i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println("총합:"+sum);

            if (sum==0){
                System.out.println("반복횟수:"+count);
                break;
            }
        }



    }
}
