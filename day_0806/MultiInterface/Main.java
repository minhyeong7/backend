package day_0806.MultiInterface;

public class Main {
    public static void main(String[] args) {
        BluetoothMIC bm = new BluetoothMIC();

        bm.music();
        bm.sing();

        Microphone m= bm;
        m.sing();
        //m.music();  사용불가

        Speaker s=bm;
        //s.sing(); 사용불가
        s.music();



    }
}
