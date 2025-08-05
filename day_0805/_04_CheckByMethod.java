package day_0805;

class Animal2{
    void cry(){}

}

class Pig2 extends Animal2 {
    @Override
    void cry(){
        System.out.println("꿀꿀");
    }
}

class Cow2 extends  Animal2{
    @Override
    void cry(){
        System.out.println("음메");
    }
}

class Farm2{
    void sound(Animal2 animal){
        animal.cry();
    }
}

public class _04_CheckByMethod {
    public static void main(String[] args) {
        Farm2 f2 = new Farm2();
        Pig2 p2=new Pig2();
        Cow2 c2=new Cow2();
        f2.sound(p2);
        f2.sound(c2);

    }
}
