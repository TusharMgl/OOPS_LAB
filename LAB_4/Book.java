package LAB_4;

public class Book {
    String title;
    String author;
    int publicationYear;

    
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1; 
    }

   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = -1; 
    }

   
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + 
                           (publicationYear == -1 ? "" : ", Year: " + publicationYear));
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Brave New World", "Aldous Huxley", 1932);

        book1.display();
        book2.display();
        book3.display();
    }
}
