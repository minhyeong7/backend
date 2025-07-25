package day_0724.ClassEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog1= new Dog("누렁이",3);
        Dog dog2= new Dog("바둑이",5);
        Dog dog3= new Dog("흰둥이");
        Dog dog4= new Dog();


        Cat cat1= new Cat("먼치킨",5,'남');

        cat1.introduce();


        dog1.introduce();
        dog2.introduce();
        //dog3.age=1;
        dog3.introduce();

        dog1.weare();
        dog2.weare();

        cat1.Meow();

        //dog1.age= 4;
        dog1.introduce();

        //dog4.name="까만애";
        //dog4.age=-1;
        dog4.introduce();

        dog4.setName("까만애");
        dog4.setAge(1);
        System.out.println(dog1.getAge());
        dog4.introduce();

        dog4.setName("멍진화");
        System.out.println(dog4.getName());

        System.out.println(dog1.bark);
        System.out.println(Dog.count);


        int bob = cat1.feedCount(5);
        System.out.println("밥 횟수"+bob);


        int bob2= cat1.feedCount(4,3);
        System.out.println(bob2);
    }
}
