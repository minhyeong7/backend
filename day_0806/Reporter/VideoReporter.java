package day_0806.Reporter;

public class VideoReporter implements Reportable{
    @Override
    public void report(){
        System.out.println("영상과 함께 화재 신고를 진행합니다");
    }
}
