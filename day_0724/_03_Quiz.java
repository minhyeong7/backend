package day_0724;

public class _03_Quiz {
    public static void main(String[] args) {
        // 신발가게에 갔습니다. 신발 사이즈는 250 부터 295 까지 있습니다. (5 단위)

        int[] size = new int[10];
        int num=250;
        for (int i = 0; i < size.length; i++) {
            size[i]=num;
            num+=5;
        }
        for (int i=0; i<size.length; i++){
            System.out.println("사이즈:"+size[i]+"(재고 있음)");
        }

    }
}
