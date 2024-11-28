public class MyApp {

    public static void main(String[] args) {
        Library library = new Library("Sunmoon University Library");
        LibraryApplication libApp = new LibraryApplication();

        System.out.println("도서관 이름 : " + library.getName());

        libApp.registerBook("토지", "박경리");
        libApp.registerBook("광장", "최인훈");
        libApp.registerBook("모순", "양귀자");
        libApp.registerBook("장마", "윤흥길");

        libApp.displayAvailableBooks();

        libApp.displayBorrowedBooks();

    }

}
