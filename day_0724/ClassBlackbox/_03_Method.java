package day_0724.ClassBlackbox;

public class _03_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";


        b1.autoReport();
        BlackBox.conAutoReport = true;
        b1.autoReport();


        b1.insertMemoryCard(128);

        // 1번: 일반영상
        // 2번: 이벤트 영상
        int fileCount= b1.getVideoFileCount(1);
        System.out.println(fileCount+"개");



    }
}
