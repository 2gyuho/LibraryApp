package service;

import domain.Book;
import domain.Borrower;

import java.util.HashSet;
import java.util.TreeSet;

public class RegistrationService {

    TreeSet<Book> books = new TreeSet<>();
    HashSet<Borrower> borrowers = new HashSet<>();

    public void registerBook(String title, String author) {
        Book book = new Book(title, author, books.size() + 1);
        books.add(book);
        System.out.println("새로운 책이 등록되었습니다. \n" + book);
    }

    public void registerBorrower(Borrower borrower) {
        borrowers.add(borrower);
        System.out.println("새로운 이용자가 등록되었습니다. \n 등록된 이용자 : " + borrower);
    }

    public TreeSet<Book> getBooks() {
        return books;
    }

    public HashSet<Borrower> getBorrowers() {
        return borrowers;
    }

}
