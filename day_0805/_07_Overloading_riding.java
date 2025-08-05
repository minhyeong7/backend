package day_0805;

class Parent1{
    public void display(){
        System.out.println("부모 클래스의 display() 메서드입니다");
    }

}

class Child1 extends Parent1{
    @Override
    public void display(){
        System.out.println("자식 클래스의 display() 메서드입니다");
    }

//   위에있는 메서드를 오버로딩
    public void display(String str){
        System.out.println(str);
    }
}

public class _07_Overloading_riding {
    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.display();
        Parent1 pa = new Parent1();
        pa.display();
        Parent1 pa1=new Child1();
        pa1.display();

        ch.display("오버로딩된 메서드");
        //pa1.display("오버로딩된 메서드");







    }
}
