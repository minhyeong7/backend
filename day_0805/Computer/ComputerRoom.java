package day_0805.Computer;

public class ComputerRoom {
//    Samsong computer1;
//    Samsong computer2;

//    LZ computer1;
//    LZ computer2;

    Computer computer1;
    Computer computer2;


    void allPowerOn(){
        // 오버라이딩 해서 변형시킴
        computer1.powerOn();
        computer2.powerOn();

    }

    void allPowerOff(){
        // 부모클래스(Computer)에 있는 메서드
        computer1.powerOff();
        computer2.powerOff();
    }


}
