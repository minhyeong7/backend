package day_0806.Reporter;

public class NomalReporter implements Reportable{
    @Override
    public void report(){
        System.out.println("일반 화재 신고를 진행합니다");
    }
}
