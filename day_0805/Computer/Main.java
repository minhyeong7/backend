package day_0805.Computer;

public class Main {
    public static void main(String[] args) {
        ComputerRoom cr = new ComputerRoom();

//        cr.computer1 =  new Samsong();
//        cr.computer2 = new Samsong();


//       LZ computer1 =new LZ(); //바뀌기 전
        cr.computer1= new LZ();
        cr.computer2 = new LZ();
//  ComputerRoom 클래스에
//  Computer computer1;
//    Computer computer2; 이걸로 변환

//        Computer computer1 = new LZ(); // 바뀐후

        cr.allPowerOn();
        cr.allPowerOff();




    }
}
