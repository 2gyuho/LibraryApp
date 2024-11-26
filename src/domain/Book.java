package domain;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private int catalogueNumber;
    private boolean isLoaned = false;

    public Book(String title, String author, int catalogueNumber) {
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
    }

    public Book(int catalogueNumber) {
        this("", "", catalogueNumber);
    }

    public boolean check() {
        return !isLoaned;
    }

    public String toString() {
        return "제목: " + title + "\n저자: " + author + "\n고유번호: " + catalogueNumber;
    }

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.catalogueNumber, otherBook.catalogueNumber);
    }
}
