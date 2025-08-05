package day_0805.Calendar;

public class Main {
    public static void main(String[] args) {
        DeskCalendar dc = new DeskCalendar("무지개색",8);
        System.out.println(dc.a);
        dc.info();
        dc.hanging();
        dc.onTheDesk();

        System.out.println("--------------------------------------------");

        Calendar c = new DeskCalendar("투명색",12);
        System.out.println(c.a);
        c.info();
        c.hanging();
        // c.onTheDesk(); // 자식에게만 있는 메소드라 사용불가


    }
}
