package domain;

public class Borrower {

    private String name;
    private boolean isLoaned = false;

    public Borrower(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean check() {
        return !isLoaned;
    }

}
