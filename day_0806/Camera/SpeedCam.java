package day_0806.Camera;

import day_0806.Detector.Detectable;
import day_0806.Reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector){
        this.detector = detector;
    }

    public void setReporter(Reportable reporter){
        this.reporter= reporter;
    }

    @Override
    public void showMainFeature(){
        System.out.println("속도측정, 번호인식");
    }

    @Override
    public void report(){
        reporter.report();
    }

    @Override
    public void detect(){
        detector.detect();
    }
}
