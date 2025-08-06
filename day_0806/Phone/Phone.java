package day_0806.Phone;

public abstract class Phone {
//    반드시 써야하는 메소드를 써야할때 abstract씀
    abstract void openingLogo(); // 자식클래스 에서 무조건 오버라이딩 해야함
    

    void powerOn(){
        openingLogo();
        System.out.println("핸드폰이 켜집니다");
    }

    void powerOff(){
        System.out.println("핸드폰이 꺼집니다");
    }



}
