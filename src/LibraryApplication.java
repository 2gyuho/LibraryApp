import domain.Borrower;
import service.DisplayService;
import service.LoanService;
import service.RegistrationService;

public class LibraryApplication {

    private final LoanService loanService;
    private final RegistrationService registrationService;
    private final DisplayService displayService;

    public LibraryApplication() {
        this.registrationService = new RegistrationService();
        this.loanService = new LoanService(registrationService);
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

    public void displayAvailableBooks() {
        this.displayService.displayAvailableBooks(registrationService.getBooks());
    }

    public void displayBorrowedBooks() {
        this.displayService.displayBorrowedBooks(registrationService.getBooks());
    }
}
