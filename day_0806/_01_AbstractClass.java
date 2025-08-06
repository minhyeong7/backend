package day_0806;

import day_0806.Camera.FactoryCam;
import day_0806.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        FactoryCam factoryCam =new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam=new SpeedCam();
        speedCam.showMainFeature();
    }
}
