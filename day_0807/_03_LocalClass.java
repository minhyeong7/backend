package day_0807;




public class _03_LocalClass {
    private int speed = 10;

    public void getUnit(String unitName){

        class Unit{
            public void move(){
                System.out.println(unitName + "이 "+ speed+" 속도로 이동합니다");
            }
        }

        Unit unit = new Unit();
        unit.move();

    }

    public static void main(String[] args) {

        _03_LocalClass Local = new _03_LocalClass();
        Local.getUnit("마린");

    }



}
