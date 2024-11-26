import domain.Book;
import domain.Borrower;
import domain.Loan;
import domain.LoanHistory;
import service.DisplayService;
import service.LoanService;
import service.RegistrationService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class LibraryApplication {

    private final LoanService loanService;
    private final RegistrationService registrationService;
    private final DisplayService displayService;

    public LibraryApplication() {
        this.loanService = new LoanService();
        this.registrationService = new RegistrationService();
        this.displayService = new DisplayService();
    }

    public void registerBook(String title, String author) {
        this.registrationService.registerBook(title, author);
    }

    public void registerBorrower(String name) {
        this.registrationService.registerBorrower(new Borrower(name));
    }

    public void loanBook(String name, int catalogueNumber) {
        this.loanService.loanBook(name, catalogueNumber);
    }

    public void returnBook(String name, int catalogueNumber) {
        this.loanService.returnBook(name, catalogueNumber);
    }

    public void display(String type) {
        this.displayService.display(registrationService.getBooks(), type);
    }
}
