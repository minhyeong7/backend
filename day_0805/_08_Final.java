package day_0805;

import day_0804.Camera.ActionCam;
import day_0804.Camera.SlowActionCam;

public class _08_Final {
    public static void main(String[] args) {
        // Final
        ActionCam actionCam = new ActionCam();
       //  actionCam.lens="표준렌즈"; 안됨 final
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-------------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();

    }


}
