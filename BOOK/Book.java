public abstract class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int avaiableQuantity;

    Book() {
        System.out.println("");
    }

    Book(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.avaiableQuantity = avaiableQuantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvaiableQuantity() {
        return avaiableQuantity;
    }

    public void setAvaiableQuantity(int avaiableQuantity) {
        this.avaiableQuantity = avaiableQuantity;
    }

    void addQuantity(int amount) {
        this.avaiableQuantity += amount;
    }

    void sellQuantity(int amount) {
        this.avaiableQuantity -= amount;
    }

    public abstract void showDetails();
    /*
     * {
     * System.out.println("ISBN :"+isbn);
     * System.out.println("Book Title :"+bookTitle);
     * System.out.println("Author Name :"+authorName);
     * System.out.println("Price :"+price);
     * System.out.println("Available Quantity :"+avaiableQuantity);
     * }
     */
}