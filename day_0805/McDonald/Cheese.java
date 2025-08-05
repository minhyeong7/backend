package day_0805.McDonald;

public class Cheese extends Hamburger {
    Cheese(String name){
        super(name);

    }

    @Override
    void cook() {
        super.cook();
        System.out.println("치즈 추가");
    }
}
