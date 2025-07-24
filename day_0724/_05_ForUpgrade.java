package day_0724;

public class _05_ForUpgrade {
    public static void main(String[] args) {
        int [] score = {90,92,92};

        int sum =0;
        double avg =0;

//        for (int i = 0; i < score.length; i++) {
//            sum+=score[i];
//
//        }

        for ( int val : score){
            sum+=val;
        }
        avg=(double) sum/score.length;
        System.out.println(avg);
        System.out.println(sum);


        String [] str={"A","B","C","D"};
        for (String s:str){
            System.out.print(s);
        }
    }
}
