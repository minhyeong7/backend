package day_0807;

class Calculator{
    private int val1; // 인스턴스 멤버
    private int val2;

    static int sum = 0; //스태틱 멤버

    public Calculator(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    // 내부 클래스
    public class Calc{
        public int add(){
            return val1 + val2;
        }
    }

}

public class _01_InstanceClass {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10,11);
        Calculator.Calc c = cal.new Calc();

        System.out.println("합 :" + c.add());

    }
}
