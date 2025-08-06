package day_0806.Camera;

public abstract class Camera {

    public void takePicture(){
        System.out.println("사진을 촬영합니다");
    }

    public void recordVideo(){
        System.out.println("동영상으로 촬영합니다");
    }

    public abstract void showMainFeature();
}
