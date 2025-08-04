package day_0804;

public class Customer extends  Person{
    int memberID;

    Customer(String name, int age, int memberID){
        super(name,age);
        this.memberID = memberID;

    }

    void enter(){
        System.out.println("회원번호:"+memberID + "이고"+age+"세 "+name+" 님 입장");

    }

}
