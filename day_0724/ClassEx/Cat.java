package day_0724.ClassEx;

public class Cat {
    String name;
    int age;
    char gender;

    public  Cat(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void Meow(){
        System.out.println(name+": 메에오");
    }


}
