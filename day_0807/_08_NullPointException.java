package day_0807;

public class _08_NullPointException {
    public static void main(String[] args) {

        try{
            String[] strArray = null;
            System.out.println(strArray[0]);
        }catch (Exception e){
            System.out.println(e+":오류발생");
        }finally{
            System.out.println("종료");
        }

    }
}
