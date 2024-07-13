
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("قصاصات قابلة للحرق", "Ahmed Khalid Tawfeek", 2007);
        Magazine magazine = new Magazine("Mag", "Author", 2022);
        DVD dvd = new DVD("DVD Title", "DVD Author", 2023);

        library.addResource(book);
        library.addResource(magazine);
        library.addResource(dvd);

        library.displayAllResources();
        library.checkAvailability(book);
    }
}
