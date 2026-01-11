public class Book{
    String title;
    String author;
    String isbn;
    double price;
    boolean isAvailable;
    double discount;
    Book(String title, String author, String isbn, double price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.isAvailable = true;
    }Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = 0.0;
        this.isAvailable = true;
    }Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isbn = "0000000000";
        this.price = 0.0;
        this.isAvailable = true;
    }void displayBookDetails(){
        System.out.println("Title: " + title);  
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }void borrowBook(){
        if (isAvailable){
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        }else{
            System.out.println("Sorry, the book: " + title + " is currently not available for borrowing.");
        }
    }void returnBook(){ 
        isAvailable = true;
        System.out.println("You have returned the book: " + title);
    }void applyDiscount(double percentage){
        discount = (percentage / 100) * price;
        price -= discount;
        System.out.println("A discount of " + percentage + "% has been applied. New price: " + price);
    }
}
public class BookLibraryDemo{
    public static void main(String[] args){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99);
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
        book1.displayBookDetails();
        book1.borrowBook();
        book1.displayBookDetails();
        book1.returnBook();
        book1.displayBookDetails();
        book1.applyDiscount(15);
        System.out.println();
        book2.displayBookDetails();
        book2.borrowBook();
        book2.displayBookDetails();
        book2.returnBook();
        book2.displayBookDetails();
        book2.applyDiscount(10);
        System.out.println();
        book3.displayBookDetails();
        book3.borrowBook();
        book3.displayBookDetails();
        book3.returnBook();
        book3.displayBookDetails();
        book3.applyDiscount(5);
    }
}