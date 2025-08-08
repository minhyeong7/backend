package day_0808;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    String lang;

    Student(String name, String lang){
        this.name=name;
        this.lang=lang;
    }

    void a(String lang){
        if(this.lang.equals("자바") ){
            System.out.println(this.name+this.lang);
        }
    }

}

public class _Quiz_ArrayList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();


        list.add(new Student("A","파이썬"));
        list.add(new Student("B","자바"));
        list.add(new Student("C","C"));
        list.add(new Student("D","파이썬"));
        list.add(new Student("E","자바"));


        // for문을 돌려 equals 사용 자바를 배운 학생 이름만 뽑기

        for(Student s : list){
            s.a(s.lang);
        }



    }
}
