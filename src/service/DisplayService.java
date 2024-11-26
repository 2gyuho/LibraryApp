package service;

import domain.Book;

import java.util.TreeSet;

public class DisplayService {

    public void display(TreeSet<Book> books, String type) {
        switch (type) {
            case "대출가능":
                for (Book b : books) {
                    if (b.check()) {
                        System.out.println(b);
                    }
                }
                break;
            case "대출중":
                for (Book b : books) {
                    if (!b.check()) {
                        System.out.println(b);
                    }
                }
                break;
            default:
                System.out.println("올바른 display 타입을 입력해주세요.");
                break;
        }
    }

}
