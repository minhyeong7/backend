package day_0807;

public class _21_Finally2 {
    public static void main(String[] args) {
        try{
            System.out.println("택시의 문을 연다");
            throw new Exception("휴무 택시");
        }catch (Exception e){
            System.out.println("문제 발생 : "+e.getMessage());
        }finally {
            System.out.println("택시의 문을 닫는다");
        }

        System.out.println("--------------");
        try{
            System.out.println( 3/0);
        }finally {
            System.out.println("프로그램 종료");
        }
        System.out.println("나도 뜰까?");
    }

}
