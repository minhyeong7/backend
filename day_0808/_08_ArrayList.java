package day_0808;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("이름: " +name + ", 나이: "+age);
    }
}

public class _08_ArrayList {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("철수",20));
        people.add(new Person("영희",25));
        people.add(new Person("민수",30));

        for (Person p : people){
            p.introduce();
        }






    }



}
