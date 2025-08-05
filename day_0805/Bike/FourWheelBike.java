package day_0805.Bike;

public class FourWheelBike extends  Bike{

    FourWheelBike(String riderName){
        super(riderName);
    }

    @Override
    void info(){
        super.info();
    }

    void addWheel(){
        if(wheel == 2){
            wheel =4;
            System.out.println(riderName + "의 자전거에 보조바퀴 부착");
        }else{
            System.out.println(riderName + " 의 자전거는 이미 보조바퀴 있음");
        }
    }



}
