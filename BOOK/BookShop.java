public class BookShop {
    private String name;
    private TextBook textBooks[];
    private StoryBook storyBooks[];

    BookShop() {
        System.out.println("");
    }

    BookShop(String name, int textBooks, int storyBooks) {
        this.name = name;
        // textBooks = new textBook[count];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void insertTextBook(TextBook tb) {
        int check = 0;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("hurray!!! TextBook added");
        } else {
            System.out.println("It's not added yeat:( ");

        }
    }

    void removeTextBook(TextBook tb) {
        int check = 0;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == tb) {
                textBooks[i] = null;
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("You've successfully removed textBook.");
        } else {
            System.out.println("You've faiied to remove textbook");
        }
    }

    void searchTextBook(String isbn) {
        int check = 0;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i].getIsbn().equals(isbn)) {
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("Yahoo!!! textBook found.");
        } else {
            System.out.println("Not found yeat:(");
        }

    }

    public void showAllTextBooks() {
        System.out.println("Text-Book Name :" + name);
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i].showDetails();
            } else {
                System.out.println("Books aren't found:(");
            }
        }

    }

    void insertStoryBook(StoryBook sb) {
        int check = 0;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("hurray!!! StoryBook added.");
        } else {
            System.out.println("It's not added yeat");
        }
    }

    void removStoryBooks(StoryBook sb) {
        int check = 0;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == sb) {
                storyBooks[i] = null;
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("You've successfully removbed StoryBook");
        } else {
            System.out.println("You've failed to remove StoryBook");
        }

    }

    void searchStoryBook(String isbn) {
        int check = 0;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i].getIsbn().equals(isbn)) {
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("Yahoo!!! StoryBook found.");
        } else {
            System.out.println("Not found yeat:(");
        }

    }

    public void showAllStoryBooks() {
        System.out.println("Story-Book Name :" + name);
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i].showDetails();
            } else {
                System.out.println("Books aren't found:(");
            }
        }

    }

    public void showDetails() {
        System.out.println("Shop Name :" + name);
        System.out.println("Text-Book detalis :");
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null) {
                textBooks[i].showDetails();
            } else {
                System.out.println("Text-book not found");
            }
        }
        System.out.println();
    }

}
