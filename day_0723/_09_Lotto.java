package day_0723;

public class _09_Lotto {
    public static void main(String[] args) {
        // 06 11 17 33 39
        int[] numbers = new int[6];
        int sum;
        int count = 0;
        int compare;
        int prevnum;
        int[] Lotto = {06, 11, 17, 33, 39};
        while (true) {
            count++;
            sum = 0;
            compare = 0;

            for (int i = 1; i < numbers.length; i++) {
              prevnum   = (int) (Math.random() * 45) + 1;
              numbers[0]=prevnum;
              for (int j=0; j<numbers.length; j++){
                  if(numbers[j]!=prevnum){
                      numbers[j]=prevnum;

                  }
              }

            }


            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();


            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < Lotto.length; j++) {
                    if (numbers[i] == Lotto[j]) {
                        compare++;
                        break;
                    }

                }

            }
            if(compare==5){
                System.out.println("횟수:"+count);
                break;
            }

        }
    }
}