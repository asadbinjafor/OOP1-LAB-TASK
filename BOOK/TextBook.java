public class TextBook extends Book {
    int standard;

    TextBook() {
        System.out.println();
    }

    TextBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, avaiableQuantity);
        this.standard = standard;
    }

    void setStandard(int standard) {
        this.standard = standard;
    }

    int getStandard() {
        return standard;
    }

    public void showDetails() {

        System.out.println("ISBN :" + super.getIsbn());
        System.out.println("Book Title :" + super.getBookTitle());
        System.out.println("Author Name :" + super.getAuthorName());
        System.out.println("Price :" + super.getPrice());
        System.out.println("Available Quantity :" + super.getAvaiableQuantity());
        System.out.println("Standard :" + standard + " th");
    }
}
