package day_0804.Camera;

public class FactoryCam extends  Camera{

    public FactoryCam(){
        super("공장카메라");

    }
    @Override
    public void takePicture(){
        System.out.println("사진을 촬영합니다");
    }
    @Override
    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }

    public void detectFire(){
        System.out.println("화재를 감지합니다");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name+"의 주요기능 화재감지");
    }
}
