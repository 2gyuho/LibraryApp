package service;

import domain.Book;
import domain.Loan;
import domain.LoanHistory;

import java.util.ArrayList;
import java.util.LinkedList;

public class LoanService {

    private final RegistrationService registrationService;

    private LinkedList<Loan> loans = new LinkedList<>();
    private ArrayList<LoanHistory> loanHistories = new ArrayList<>();

    public LoanService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    private Book findBook(int catalogueNumber) {
        Book searchedBook = new Book(catalogueNumber);
        for (Book book : registrationService.getBooks()) {
            if (book.compareTo(searchedBook) == 0) {
                return book;
            }
        }
        return null;
    }

    public void loanBook(String name, int catalogueNumber) {
        Book book = new Book(catalogueNumber);

    }

    public void returnBook(String name, int catalogueNumber) {
        //todo
    }

    public LinkedList<Loan> getLoans() {
        return loans;
    }

    public ArrayList<LoanHistory> getLoanHistories() {
        return loanHistories;
    }

}
