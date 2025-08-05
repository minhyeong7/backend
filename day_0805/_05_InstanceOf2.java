package day_0805;

class Animal3{}
class Pig3 extends Animal3{}


public class _05_InstanceOf2 {
    public static void main(String[] args) {
        Pig3 p3 = new Pig3();
        Pig3 p4 = new Pig3();

        Animal3 a= p3;
        Animal3 b = new Pig3();


        if(a instanceof Pig3){
            System.out.println("객체 변수 a는 Pig3 타입으로 생성된 객체이다");
        } // a는 Pig3로 생성된 객체를 참조하고 있는 Animal3 타입의 객체 변수

        if(a == p3){
            System.out.println("a와 p3는 같은 객체를 참조하고 있습니다");
        }// ==은 주소가 같은지 아닌지 판단

        if(a !=p4){
            System.out.println("a와 p4는 같은 객체를 참조하고 있지 않습니다");
        }





    }
}
