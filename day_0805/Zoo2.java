package day_0805;



class Animul{
    public void makeSound(){}
}
class Dogg extends  Animul{
    public void makeSound(){
        System.out.println("멍멍!");
    }
}

class Catt extends  Animul {
    public void makeSound(){
        System.out.println("야옹!");
    }
}

class Cowws extends  Animul{
    public void makeSound(){
        System.out.println("음메~");
    }
}

public class Zoo2 {
    public static void main(String[] args) {
        Animul dogg=new Dogg();
        Animul catt=new Catt();
        Animul cowws=new Cowws();

        playAnimalSound(dogg);
        playAnimalSound(catt);
        playAnimalSound(cowws);

    }

   public  static void playAnimalSound(Animul animul){
        animul.makeSound();

    }


}


