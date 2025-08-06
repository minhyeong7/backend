package day_0806.Phone2;

public class Main {
    public static void main(String[] args) {
        Person jimin = new Person(new PineApplePhone2());
        jimin.turnOnPhone();

        for(int i= 1; i<5; i++){
            jimin.watchUtube();

            if(i % 3 ==0){
                jimin.chargePhone();
            }
        }

        jimin.buyNewPhone(new ThreeStarPhone2());
        jimin.turnOnPhone();
    }
}
