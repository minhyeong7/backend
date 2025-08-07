package day_0807;

public class _20_Throw {
    public static void main(String[] args) {
        int age = 17;

        try{
            if (age < 19){
                throw new Exception("19세 미만에게는 담배를 판매하지 않습니다");
            }
            else if(age>=19){
                System.out.println("담배를 판매합니다");
            }
        }catch (Exception e){
            System.out.println("나이가 되지 않습니다 다시 돌아가세요");
            System.out.println("이런 오류 발생:"+e.getMessage());
        }finally{
            System.out.println("판매가 종료되었습니다");
        }
    }
}
