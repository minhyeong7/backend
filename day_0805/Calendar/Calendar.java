package day_0805.Calendar;

public class Calendar {
    String color;
    int months;
    String a="a";

    Calendar(String color, int months){
        this.color = color;
        this.months =months;

    }
    void info(){
        System.out.println(color + " 달력은 " + months + "월까지 있습니다");
    }

    void hanging(){
        System.out.println(color + " 달력은 벽에 갈 수 있습니다.");
    }



}
