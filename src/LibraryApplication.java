import domain.Borrower;
import service.DisplayService;
import service.LoanService;
import service.RegistrationService;

public class LibraryApplication {

    private final LoanService loanService;
    private final RegistrationService registrationService;
    private final DisplayService displayService;

    public LibraryApplication() {
        this.loanService = new LoanService(RegistrationService);
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
