package day_0723;

public class _07_Array {
    public static void main(String[] args) {
        String a =  "똘기";
        String b=   "떵이";
        String c =  "호치";
        String d =  "새촘이";
        String e =  "드라곤";
        String f =  "요롱이";
        String g =  "마초";
        String h =  "미미";
        String i =  "뭉치";
        String k =  "키키";
        String l =  "강다리";



        System.out.println("토끼와 거북이 동화에 문제가 생겼다");
        System.out.println(g);
        System.out.println(b);
        System.out.println(e);
        System.out.println(l);

        String [] ggrugi ={"똘기","떵이","호치","새촘이","드라곤"};

        System.out.println(ggrugi[0]);
        System.out.println(ggrugi[1]);
        System.out.println(ggrugi[2]);

        for (int m=0; m<5; m++){
            System.out.println(ggrugi[m]+ " ");
        }

        int [] number = new int [3];
        number[0] = 1;
        number[1] =5;
        number[2] =7;

        for (int m=0; m<3; m++){
            System.out.println(number[m]+ " ");
        }

//        배열의길이
        System.out.println(number.length);
    }
}
