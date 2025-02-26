public class StoryBook extends Book {
    String category;

    StoryBook() {
        System.out.println("");
    }

    StoryBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, avaiableQuantity);
        this.category = category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    String getCategory() {
        return category;
    }

    public void showDetails() {

        System.out.println("ISBN :" + super.getIsbn());
        System.out.println("Book Title :" + super.getBookTitle());
        System.out.println("Author Name :" + super.getAuthorName());
        System.out.println("Price :" + super.getPrice());
        System.out.println("Available Quantity :" + super.getAvaiableQuantity());
        System.out.println("Category :" + category);
    }
}
