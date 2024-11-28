package service;

import domain.Book;
import domain.Borrower;

import java.util.HashSet;
import java.util.TreeSet;

public class DisplayService {

    public void displayAvailableBooks(TreeSet<Book> books) {
        System.out.println("====================[대출 가능한 책 목록]====================");
        for (Book b : books) {
            if (b.check()) {
                System.out.println(b + "\n");
            }
        }
        System.out.println("============================================================");
    }

    public void displayBorrowedBooks(TreeSet<Book> books) {
        System.out.println("=====================[대출 중인 목록]====================");
        for (Book b : books) {
            if (!b.check()) {
                System.out.println(b + "\n");
            }
        }
        System.out.println("=======================================================");
    }

    public void displayBorrower(HashSet<Borrower> borrowers) {
        System.out.println("=====================[대출자 목록]====================");
        for (Borrower b : borrowers) {
            System.out.println(b + "\n");
        }
        System.out.println("============================================================");
    }
}
