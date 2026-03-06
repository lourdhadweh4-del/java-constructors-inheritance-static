public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {

        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        Book myBook = new Book();

        System.out.println("Book Title: " + myBook.title);
        System.out.println("Book Author: " + myBook.author);
        System.out.println("Book Price: " + myBook.price);

        Book myBook2 = new Book("Harry Potter", "Richard Morgan");

        System.out.println("Book Title: " + myBook2.title);
        System.out.println("Book Author: "+ myBook2.author);
        System.out.println("Book Price: " + myBook2.price);


        Book myBook3 = new Book("Alchemist", "Morgan", 20.99);

        System.out.println("Book Title: " + myBook3.title);
        System.out.println("Book Author: " + myBook3.author);
        System.out.println("Book Price: " + myBook3.price);


    }
}
