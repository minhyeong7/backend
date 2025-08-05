package day_0804.book;

public class Comic extends Book{
    boolean isColor;

    Comic(String title, String author, boolean isColor){
        super(title,author);
        this.isColor=isColor;

    }


    @Override
    void info_title(){
        System.out.println("이 만화책의 제목은"+title);
    }

    void info_author(){
        System.out.println("이책의 저자는"+author);
    }

    void info_color(){
        if (isColor){
            System.out.println("이 만화책은 컬러");
        }else{
            System.out.println("이 만화책은 흑백");
        }
    }
}
