package day_0721;

public class _014_Operator4 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a != b);

        a=10;
        b=11;
        System.out.println( a != --b);

        System.out.println(5>3);
        System.out.println(5<=3);
        System.out.println(5 != 3);


        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4= false;

        System.out.println("---------논리곱--------");
        System.out.println(b1 && b2); // true? false?
        System.out.println(b1 && b3);
        System.out.println(b2 && b4);
        System.out.println(b1&&b2&&b3);
        System.out.println();




        System.out.println("---------논리합--------");
        System.out.println(b1 || b2); // true? false?
        System.out.println(b1 || b3);
        System.out.println(b2 || b4);
        System.out.println(b1||b2||b3);
        System.out.println();

        System.out.println("-------배타적 논리합------");
        System.out.println(b1 ^ b2);
        System.out.println(b1 ^ b3);

        System.out.println(!true);
        System.out.println(!false);

    }
}
