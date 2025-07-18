package day_0718;

public class _03_variables {
    public static void main(String[] args) {
        String hello = "안녕하세요";
        int time = 10;

        System.out.println(hello+" 홍길동님 "+time+"시에 만나요");
        System.out.println(time);
        System.out.println(hello + " 그렇게 합시다");

        double height = 175.6;
        char gender = 'M';
        hello = "안녕";
        System.out.println(hello+"? 키는"+height+"성별은 "+gender+"입니다");

        boolean love = true;
        System.out.println("그는 나를 좋아할까요"+love);

        double d = 2.09281;
        float e = 5.32412312f;
        long i= 100000000000000000L;

        System.out.println(d);
        System.out.println(e);
        System.out.println(i);


        i=3_0000_3000L;
        System.out.println(i);

    }
}
