package day_0806.Phone2;

public class ThreeStarPhone2 implements Phone {
    int batteryCapacity = 35;
    boolean isOn = false;


    @Override
    public void powerOn() {
        if (batteryCapacity > 30) {
            System.out.println("★★★ 폰 켜져요!! ★★★ \n");
            isOn = true;

        } else {
            System.out.println("배터리 없어요...");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("★★★ 폰 꺼져요!! ★★★\n");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        if (isOn) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void watchUtube() {
        if (batteryCapacity > 10) {
            System.out.println("유튜브좀 보겠소");
            batteryCapacity -= 10;
            System.out.println("잔여 배터리..." + batteryCapacity + "%\n");
        } else {
            System.out.println("배터리 없어요...");
            powerOff();
        }
    }

    @Override
    public void charge() {
        if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
            System.out.println("---충전중---");
            batteryCapacity += 5;
            System.out.println("잔여 배터리..." + batteryCapacity + "%\n");
        } else {
            System.out.println("충전할 필요가 없어요");
            System.out.println("잔여 배터리..." + batteryCapacity + "%\n");
        }
    }
}