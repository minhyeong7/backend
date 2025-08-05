package day_0805.McDonald;

public class Shrimp extends Hamburger {
    Shrimp(String name){
        super(name);

    }

    @Override
    void cook() {
        super.cook();
        System.out.println("새우 추가");
    }
}
