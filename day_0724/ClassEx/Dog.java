package day_0724.ClassEx;

public class Dog {
    private String name; //필드
    private int age; //
    static String bark ="멍멍";
    static int count;

    // public 모든곳에서
     // protected 같은패키지 + 다른 패키지는 상속받았을때만 사용가능
     // default 같은 패키지 안에서만 사용가능
     // private 그 클래스 내에서만


    //    클래스는 public or default
    public Dog(){

    }
    public Dog(String name){
        this.name=name;
    }

    public Dog(String name, int age){ // 생성자
        this.name=name;
        this.age=age;
    }



    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public  void setAge(int age){
        if(age >=1){
            this.age=age;
        }else{
            System.out.println("나이는 1살부터 입력가능");
        }
    }

    public int getAge(){
        return age;
    }
    public  void weare(){
        System.out.println("우리는 갱얼쥐");
    }

    public  void introduce(){ // 메소드
        System.out.println("이름:"+ this.name + " 나이:" + this.age);
        count++;
    }
}
