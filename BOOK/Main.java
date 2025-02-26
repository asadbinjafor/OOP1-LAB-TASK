public class Main {
    public static void main(String[] main) {
       
        Book book = new StoryBook("23-50088-1", "A GAME OF THRONES",
                "MARTIN", 15.08, 10, "Fantasy Novel");
        book.addQuantity(6);
        book.sellQuantity(9);

        book.showDetails();
        System.out.println("\n");
       
        Book book2 = new TextBook("978-0-32-2", "The Great Gatsby", "Scott", 109.99, 12,
                8);
        book2.addQuantity(9);
        book2.sellQuantity(6);
        book2.showDetails();
    }
}