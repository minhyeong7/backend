package day_0805.Calendar;

public class DeskCalendar extends Calendar {

    String a= "aaa";
    DeskCalendar(String color, int months){
        super(color,months);
    }

    @Override
    void hanging(){
        System.out.println(color+ " 달력은 벽에 걸려면 추가 고리 필요");
    }

    void onTheDesk(){
        System.out.println(color+"달력은 책상에 세울수있씁니다");
    }
}
