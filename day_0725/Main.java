package day_0725;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car("현대","흰색","쏘나타",4,3000000,"홍길동");

        car1.brand="쉐보레";
        car1.setUsername("쉐노레");

        System.out.println();
        car1.Carsound();
        car2.Carsound();

        System.out.println();
        System.out.println(Car.register_car_count+"개의 차량이 생성되었습니다");

        System.out.println();
        System.out.println("현재 차량 소유주 이름:"+car2.getUsername());

        System.out.println();
        car2.setUsername("홍길동");
        car2.setUsername("김길동");

        System.out.println();



    }
}
