package day_0721;

public class _04_datatype {
    public static void main(String[] args) {
        //byte -128 ~127
        // short -32768 ~ 32767
        // int -21억 ~21억
        // ling -900경 ~ 900경

        int a= 30;
        byte age=100;
        //byte age2=128; 에러


        int b= 32777;
        short c= 32221;
        System.out.println(b);
        System.out.println(c);

        // 소수표현
        // float 정밀도 7자리
        // duble 정밀도 15자리

        double marathon = 42.195;
        float halfMarathon = 21.0975f;
        System.out.println("마라톤은 "+marathon+"km를 달립니다.");
        System.out.println("하프 마라톤은"+halfMarathon+"km를 달립니다");

        double pieDouble=3.14159234234;
        float pieFloat = 3.141231231f;

        System.out.println("dobule:" + pieDouble);
        System.out.println("float:"+ pieFloat);


    }
}
