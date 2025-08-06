package day_0806;

import day_0806.Camera.FactoryCam;
import day_0806.Camera.SpeedCam;
import day_0806.Detector.AdvancedFireDetector;
import day_0806.Detector.Detectable;
import day_0806.Detector.FireDetector;
import day_0806.Reporter.NomalReporter;
import day_0806.Reporter.Reportable;
import day_0806.Reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        FireDetector fd= new FireDetector();
        fd.detect();

        Detectable afd = new AdvancedFireDetector();
        afd.detect();

        System.out.println("---------------1---------------");

        NomalReporter nr = new NomalReporter();
        nr.report();

        Reportable vr= new VideoReporter();
        vr.report();

        System.out.println("--------------2----------------");

        FactoryCam fc=new FactoryCam();
        fc.setDetector(fd);
        fc.setReporter(nr);

        fc.detect();
        fc.report();
        fc.showMainFeature();

        System.out.println("--------------3----------------");
        SpeedCam sp = new SpeedCam();
        sp.setDetector(new AdvancedFireDetector());
        sp.setReporter(new VideoReporter());


        sp.detect();
        sp.report();
        sp.showMainFeature();


    }
}
