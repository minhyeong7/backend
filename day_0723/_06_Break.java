package day_0723;

public class _06_Break {
    public static void main(String[] args) {
        int max = 15;
        int sold =0;
        int noShow =7;

        int i=1;
        while (i<=100){
            System.out.println(i+"번 손님 치킨 나왔습니다");
            if (i == noShow){
               System.out.println(i+"번 손님 기회가 넘어갔습니다");
                i++;
                continue;
           }
            sold++;

            if (sold == max){
               System.out.println("장사 끝");
                break;
            }

            i++;
        }


//        for (int i=1; i<=100; i++){
//            System.out.println(i+"번 손님 치킨 나왔습니다");
//
//            if (i == 7){
//                System.out.println(i+"번 손님 기회가 넘어갔습니다");
//                continue;
//            }
//            sold++;
//            if (sold == max){
//                System.out.println("장사 끝");
//                break;
//            }
//
//
//
//        }



    }
}
