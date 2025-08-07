package day_0807;

interface buttonClickListener{
    public void click(); //1번
}

public class _06_AnonymousClass2 {

    public class Button{
        private buttonClickListener listener;

        public void setButtonListener(buttonClickListener listener){
            this.listener=listener;
        }

        public void click(){ // 2번
            if(listener != null){
                this.listener.click(); // 1번
            }
        }



    }

    public static void main(String[] args) {
        _06_AnonymousClass2 exam = new _06_AnonymousClass2();
        _06_AnonymousClass2.Button button = exam.new Button();



        button.setButtonListener(new buttonClickListener() {
            @Override
            public void click() { // 1번
                System.out.println("버튼 클릭");

            }
        });

        button.click(); // 2번
    }


}
