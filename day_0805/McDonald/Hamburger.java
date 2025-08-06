package day_0805.McDonald;

public class Hamburger {
    String name;

    Hamburger(String name){
        this.name=name;

    }

    void cook(){
        System.out.println(this.name+" 재료");
        System.out.println("양상추");
        System.out.println("패티");
    }
}
