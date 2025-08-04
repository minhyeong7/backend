package day_0804.access1;

public class PublicA {
    public int a;

    public PublicA(int a){
        this.a=a;
    }

    public void printA(){
        System.out.println("PublicA 클래스입니다");
    }

    Defaultc dc= new Defaultc();
    void methodA(){
        dc.variableC=29;
    }
}
