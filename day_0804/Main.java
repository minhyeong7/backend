package day_0804;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("홍길동");
        Manager mgr = new Manager("김철수");

        emp.work();
        emp.showInfo();

        System.out.println();

        mgr.work();
        mgr.showInfo();
    }
}
