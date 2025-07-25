package myGame;
import java.util.Random;

public class Mole {
    int mole_count;
    int random_mole;
    Random random = new Random();

    Mole(int mole_count){
        System.out.println("두더지가"+mole_count+"마리 생성되었습니다");
        this.mole_count=mole_count;

        this.random_mole=random.nextInt(this.mole_count)+1;
    }

    void setRandom_mole(){
        this.random_mole=random.nextInt(this.mole_count)+1;
    }


}
