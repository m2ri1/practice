package test;

import java.util.Scanner;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}


public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[2];

        for (int i = 0; i < b.length; i++) {
            System.out.print("제목>> ");
            String title = sc.nextLine();
            System.out.print("저자>> ");
            String author = sc.nextLine();
            b[i] = new Book(title, author);

        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i].title + " "  + b[i].author);


        }

    }


}
