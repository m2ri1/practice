package chapter04.constructor;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {

        this(title, "작자 미상");
        this.title = title;
        author = "작자미상";


    }


    void print() {
        System.out.println(title + " " + author);
    }


    public static void main(String[] args) {
        Book b1 = new Book("어린왕자", "생텍쥐베리");
        Book b2 = new Book("춘향전");
        b1.print();
        b2.print();
    }
}