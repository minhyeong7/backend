package day_0807;

class Printout {

    private int val;


    public static class Out{
        public void println(String str){
            System.out.println(str);
           // int result = val +10;
        }
    }
}

public class _02_StaticeClass {
    public static void main(String[] args) {
        String str = "정적 내부 클래스";
        Printout.Out out = new Printout.Out();
        out.println(str);
    }
}
