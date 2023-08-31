package chapter05.arrayclass;

import java.util.Scanner;

class Book {
    String name, person;

    Book(String name, String person) {
        this.name = name;
        this.person = person;
    }

}

public class BookDemo {
    public static void main(String[] args) {
        Book[] b = new Book[2];
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < b.length; i++) {
            System.out.print("제목 : ");
            String name = sc.nextLine();
            System.out.print("작가 : ");
            String person = sc.nextLine();
            b[i] = new Book (name, person);

        }


        for (Book book : b) {
            System.out.println(book.name+" " +book.person);
        }

    }
}