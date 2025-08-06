package day_0806.Phone2;

public interface Phone {

    public  static final int MAX_BATTERY_CAPACITY=100;

//    인터페이스는 추상 메서드만 일반메소드 사용 불가
    abstract void powerOn();
    abstract void powerOff();
    abstract boolean isOn();
    abstract void watchUtube();
    abstract void charge();








}
