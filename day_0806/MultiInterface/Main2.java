package day_0806.MultiInterface;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("------TJmic 객체--------");
        TJmic tj=new TJmic();
        tj.connect();
        tj.music();
        tj.sing();

        System.out.println("\n -----TJmic 객체를 BluetoothMIC2로 타입변환");
        BluetoothMIC2 bm= tj;
        bm.connect();
        bm.sing();
        bm.music();

        System.out.println("\n -----TJmic 객체를 Microphone으로 타입변환");
        Microphone m= tj;
//        m.connect(); X
//        m.music();   X
        m.sing();

        System.out.println("\n -----TJmic 객체를 Speaker으로 타입변환");
        Speaker s=tj;
        //s.connect(); X
        s.music();
        //s.sing(); X


    }
}
