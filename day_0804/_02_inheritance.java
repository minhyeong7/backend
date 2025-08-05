package day_0804;

import day_0804.Camera.Camera;
import day_0804.Camera.SpeedCam;

public class _02_inheritance {
    public static void main(String[] args) {
        SpeedCam sc= new SpeedCam();
        Camera c=new Camera();

        c.takePicture();

        sc.takePicture();
        sc.recordVideo();
        sc.checkSpeed();
        sc.recognizeNumber();
        sc.showMainFeature();





    }



}
