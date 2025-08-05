package day_0804.Camera;

public class ActionCam extends Camera{

    public final String lens = "광각렌즈";

    public ActionCam(){
        super("액션 카메라");
    }

    final public  void makeVideo(){
        System.out.println(this.name+" : " +  this.lens + "로 촬영한 비디오를 제작");

    }




}
