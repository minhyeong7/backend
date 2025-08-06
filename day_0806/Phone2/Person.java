package day_0806.Phone2;

public class Person {
    Phone p;

    Person(Phone p){
        this.p=p;
    }

    void buyNewPhone(Phone p){
        this.p=p;
        System.out.println(" = = = = = = = =");
        System.out.println("새 폰을 샀습니다!");
    }

    void turnOnPhone(){
        p.powerOn();

    }

    void turnOffPhone(){
        p.powerOff();
    }

    void watchUtube(){
        if(p.isOn()){
            p.watchUtube();
        }else{
            System.out.println("폰이 꺼져서 유튜브 시청 불가");
        }
    }

    void chargePhone(){
        p.charge();
    }

}
