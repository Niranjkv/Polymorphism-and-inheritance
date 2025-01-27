package Inheritence;

class LibraryItem {
    protected String title;
    protected String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of pages: " + numberOfPages);
    }
}

class Magazine extends LibraryItem {
    private String issue;

    public Magazine(String title, String author, String issue) {
        super(title, author);
        this.issue = issue;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue: " + issue);
    }
}

class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 416);
        Magazine magazine = new Magazine("National Geographic", "Various Authors", "August 2023");
        DVD dvd = new DVD("Inception", "Christopher Nolan", 148);

        book.displayInfo();
        System.out.println();
        magazine.displayInfo();
        System.out.println();
        dvd.displayInfo();
    }
}
