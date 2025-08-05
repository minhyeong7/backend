package day_0804.Camera;

public class SpeedCam extends Camera {


    public SpeedCam(){
        super("과속 단속 카메라");
    }

    @Override
    public void takePicture(){
        super.takePicture();
        checkSpeed();
        recognizeNumber();
    }

    @Override
    public void recordVideo(){
        System.out.println("동영상을 녹화합니다");
    }

    public  void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public  void recognizeNumber(){
        System.out.println("차량 번호를 인식");
    }

    @Override
    public  void showMainFeature(){
        System.out.println(this.name+ "의 주요기능: 과속단속");
    }



}
