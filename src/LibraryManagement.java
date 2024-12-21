// Main class for the Library Management System
public class LibraryManagement {
    public static void main(String[] args) {
        // Create book instances
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Use getters to display book details
        System.out.println("--- Books ---");
        System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor());
        System.out.println("Title: " + book2.getTitle() + ", Author: " + book2.getAuthor());

        // Create library member instances
        LibraryMember member1 = new LibraryMember("John Doe", 1);
        LibraryMember member2 = new LibraryMember("Jane Smith", 2);

        // Use getters to display member details
        System.out.println("\n--- Library Members ---");
        System.out.println("Name: " + member1.getName() + ", Member ID: " + member1.getMemberId());
        System.out.println("Name: " + member2.getName() + ", Member ID: " + member2.getMemberId());
    }
}

// Book Class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// LibraryMember Class
class LibraryMember {
    private String name;
    private int memberId;

    // Constructor
    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
