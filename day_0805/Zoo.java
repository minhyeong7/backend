package day_0805;

class Dog{
    public void makeSound(){
        System.out.println("멍멍!");
    }
}

class Cat {
    public void makeSound(){
        System.out.println("야옹!");
    }
}

class Coww{
    public void makeSound(){
        System.out.println("음메~");
    }
}



public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Coww coww= new Coww();

        playDogSound(dog);
        playCatSound(cat);
        playCowwSound(coww);



    }

    public static void playDogSound(Dog dog){
        dog.makeSound();
    }

    public  static void playCatSound(Cat cat){
        cat.makeSound();
    }

    public static void playCowwSound(Coww Coww){
        Coww.makeSound();
    }
}
