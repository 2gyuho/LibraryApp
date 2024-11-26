package domain;

public class Loan {

    private Book book;
    private Borrower borrower;

    public Loan(Book book, Borrower borrower) {
        this.book = book;
        this.borrower = borrower;
    }

    public String toString() {
        return "책 : " + book + "\n대출자 : " + borrower;
    }
}
