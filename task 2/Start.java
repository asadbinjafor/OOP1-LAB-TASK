import java.lang.*;

public class Start {
    public static void main(String[] args) {

   
    StoryBook storyBook1 = new StoryBook("ISBN-1234567890", "The Lord of the Rings", "J.R.R. Tolkien", 29.99, 10, "Fantasy");
    StoryBook storyBook2 = new StoryBook("ISBN-1234567891", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 19.99, 5, "Fantasy");
    StoryBook storyBook3 = new StoryBook("ISBN-0987654321", "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "C.S. Lewis", 14.99, 3, "Fantasy");
    StoryBook storyBook4 = new StoryBook("ISBN-1234567893", "The Hunger Games", "Suzanne Collins", 12.99, 2, "Dystopian");
    StoryBook storyBook5 = new StoryBook("ISBN-1234567896", "The Maze Runner", "James Dashner", 10.99, 1, "Science Fiction");

 
    TextBook textBook1 = new TextBook("ISBN-3210987654", "Math for Dummies", "Mark Ryan", 19.99, 5, 10);
    TextBook textBook2 = new TextBook("ISBN-4321098765", "Science for Dummies", "Stephen Hawking", 24.99, 3, 11);
    TextBook textBook3 = new TextBook("ISBN-5432109876", "English for Dummies", "Gerald J. Lieberman", 14.99, 2, 12);
    TextBook textBook4 = new TextBook("ISBN-6543210987", "History for Dummies", "Steve Waugh", 12.99, 1, 9);
    TextBook textBook5 = new TextBook("ISBN-7654321098", "Geography for Dummies", "Charles A. Francis", 10.99, 0, 8);


    BookShop bookShop = new BookShop();
        
        
        bookShop.setName("My Bookstore");
        
        
        Book book1 = new Book("123456789", "The Great Gatsby", "F. Scott Fitzgerald", 15.99, 50);
        
        
        if (bookShop.insertBook(book1)) {
            System.out.println("Book inserted successfully.");
        } else {
            System.out.println("Failed to insert book. The bookstore may be full.");
        }
        
        
        Book book2 = new Book("987654321", "To Kill a Mockingbird", "Harper Lee", 12.99, 40);
        
     
        if (bookShop.insertBook(book2)) {
            System.out.println("Book inserted successfully.");
        } else {
            System.out.println("Failed to insert book. The bookstore may be full.");
        }
        
       
        System.out.println("All Books in the Bookstore:");
        bookShop.showAllBooks();
        
        
        String searchIsbn = "123456789";
        Book foundBook = bookShop.searchBook(searchIsbn);
        if (foundBook != null) {
            System.out.println("Book found by ISBN " + searchIsbn + ":");
            foundBook.showDetails();
        } else {
            System.out.println("Book with ISBN " + searchIsbn + " not found.");
        }
        
      
        if (bookShop.removeBook(book1)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Failed to remove book. The book may not be in the bookstore.");
        }
        
        
        System.out.println("All Books in the Bookstore after removal:");
        bookShop.showAllBooks();
    }
}




