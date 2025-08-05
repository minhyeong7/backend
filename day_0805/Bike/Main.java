package day_0805.Bike;

public class Main {
    public static void main(String[] args) {
        Bike b = new FourWheelBike("홍길동");
        b.info();
        b.ride();
        //b.addWheel(); //에러

        System.out.println("--------------------------");

        FourWheelBike fwb= (FourWheelBike) b; // 강제 형변환
        fwb.addWheel(); // 가능

        // 모든 부모타입 객체를 자식타입으로 변환 할 수 있는것은 아님!!!!
        // 부모타입으로 자동변환 되었던 자식객체만 다시 자식객체로 강제변환 가능!!!

//        Bike c= new Bike("a");
//        FourWheelBike bc= (FourWheelBike) c; // 에러



    }
}
