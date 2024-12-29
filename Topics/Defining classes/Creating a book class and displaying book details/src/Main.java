import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Book book = new Book();

        // Set the details of the book
        // Implement here
        book.setTitle(title);
        book.setAuthor(author);
        book.setPages(100);
        System.out.println(book.getFullData());
        // Print the details of the book
        // Implement here
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    public String getFullData() {
        return "Title: "+title+", Author: " + author+", Pages: "+pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters and setters
    // Implement here
}