package day_0807;

public class _19_TryCatchAgain {
    public static void main(String[] args) {
        try{
//            System.out.println( 3/ 0);

//            int[] arr = new int[3];
//            arr[5]=100;

//            Object str= "test";
//            System.out.println((int)str);

            String s = null;
            System.out.println(s.toLowerCase());


        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("뭔가 잘못 계산 하셨네요");
        }catch(ClassCastException e){
            System.out.println("잘못된 형변환입니다");
        }catch (Exception e){
            System.out.println("이런 문제가 발생했어요: "+ e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
