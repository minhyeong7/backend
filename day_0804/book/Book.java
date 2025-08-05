package day_0804.book;

public class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

     void info_title(){
        System.out.println("책의 제목은"+title+"입니다");
    }

    void info_author(){
        System.out.println("책저자는"+author);
    }

}
