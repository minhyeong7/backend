package day_0804;

import day_0804.Camera.Camera;
import day_0804.Camera.FactoryCam;
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

        // ---------------------------- 8/5  다형성-----------------------------------

        System.out.println("-----------------");
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for(Camera cam : cameras){
            cam.showMainFeature();
        }





    }



}
