package day_0807;

public class _05_AnonymousClass {

    public static void main(String[] args) {
        //익명 클래스
        //객체생성과 동시에 바로 정의해서 사용하는 1회성 클래스

        Coffee c1 = new Coffee();

        c1.order("아메리카노");
        c1.returnTray();
        System.out.println("-------------------");

        Coffee c2 = new Coffee();
        c2.order("카페라떼");
        c2.returnTray();
        System.out.println("-------------------");

        // 사실상 자식클래스 상속된 개념
        Coffee special = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("케잌은 서비스야~");
            }
            @Override
            public  void returnTray(){
                System.out.println("내가 치울게");
            }
        };

        special.order("원피스 라떼");
        special.returnTray();
    }

}

class Coffee{

    public void order(String coffee){
        System.out.println("주문하신 "+ coffee + " 나왔습니다.");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료되었습니다.");
    }

}
