package day_0724.ClassEx;

public class Cat {
    String name;
    int age;
    char gender;
    int bob;
    public  Cat(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void Meow(){
        System.out.println(name+": 메에오");
    }

    void introduce() {
        System.out.println("나는"+name);
    }

    int  feedCount(int bob){
        System.out.println("나는"+name);
        System.out.println("밥을"+bob+"번");
        System.out.println("밥밥밥");
        return  bob *2;
    }

    // 파라미터 갯수가 다르거나
    // 자료형이 다르거나
    // 순서가 다르거나
    // 메소드 오버로딩
    int feedCount(int bab, int water){
        System.out.println("나는"+name);
        System.out.println(bab+"과"+water);
        return bab+water;
    }








}
