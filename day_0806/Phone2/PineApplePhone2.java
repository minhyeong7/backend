package day_0806.Phone2;

public class PineApplePhone2 implements Phone{
    int batteryCapacity =40;
    boolean isOn=false;


    @Override
    public void powerOn(){
        if(batteryCapacity >30){
            System.out.println("@@@ Power on!! @@@ \n");
            isOn =true;

        }else{
            System.out.println("Low Battery...");
        }
    }

    @Override
    public void powerOff(){
        System.out.println("@@@ Power Off!!@@@\n");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        if(isOn){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void watchUtube() {
        if(batteryCapacity >10){
            System.out.println("유튜브좀 보겠소");
            batteryCapacity -=10;
            System.out.println("battery is..." + batteryCapacity + "%\n");
        }else{
            System.out.println("Low battery...");
            powerOff();
        }
    }

    @Override
    public void charge() {
        if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY -20){
            System.out.println("---충전중---");
            batteryCapacity += 5;
            System.out.println("충전..." + batteryCapacity + "%\n");
        }else{
            System.out.println("충전할 필요가 없어요");
            System.out.println("충분해요..." + batteryCapacity + "%\n");
        }
    }





}
