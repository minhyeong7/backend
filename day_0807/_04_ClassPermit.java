package day_0807;

public class _04_ClassPermit {


    private class InClass{
        public void print(){
            System.out.println("접근을 private으로 제한합니다");
        }
    }

    public InClass getInClass(){
        return new InClass(); //여기서 InClass의 new 객체가 반환됨. 만약 aaa라고 한다면
                                // InClass aaa=
    }

    public static void main(String[] args) {
        _04_ClassPermit permit =new _04_ClassPermit();
        permit.getInClass().print();
    }
}
