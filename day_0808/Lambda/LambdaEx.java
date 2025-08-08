package day_0808.Lambda;

public class LambdaEx {
    public static void main(String[] args) {


        MyPrinter printer = (msg) -> System.out.println("출력: "+msg);
        printer.print("람다 예제");


        MyRunnerable r = () -> System.out.println("실행 중!");
        r.run();


        Calculator add= (a, b) -> a+b;
        System.out.println(add.compute(10,5));

        StringLength lf = (s) -> s.length();
        System.out.println(lf.getLength("hello"));


        Condition isEven =(n) -> n%2 ==0;
        System.out.println(isEven.test(5));




    }
}
