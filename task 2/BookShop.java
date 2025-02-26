import java.lang.*;
import java.util.Arrays;


public class BookShop {
    private String name;
    private Book[] books; 

    public BookShop() {
        
        this.books = new Book[100];
    }

    public BookShop(String name) {
        this.name = name;
        this.books = new Book[100];
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean insertBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                return true; 
            }
        }
        return false; 
    }

    
    public boolean removeBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(b)) {
                books[i] = null;
                return true; 
            }
        }
        return false; 
    }

    
    public void showAllBooks() {
        for (Book book : books) {
            if (book != null) {
                book.showDetails(); 
                System.out.println("---------------");
            }
        }
    }

    public Book searchBook(String isbn) {
        for (Book book : books) {
            if (book != null && book.getIsbn().equals(isbn)) {
                return book; 
            }
        }
        return null; 
    }
}
