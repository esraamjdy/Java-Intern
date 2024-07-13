import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// Adding dummy data
        List<Product> products = Product.addDummyData();


// Exercise 1: Obtain a list of products belonging to category "Books"
        List<Product> books = new ArrayList<>();
        for(Product p:products) {
            if (p.getCategory().equals("Books")) {
                books.add(p);
            }
        }
        System.out.println("Exercise 1 - Books:");
        books.forEach(System.out::println);


// Exercise 2: Obtain a list of products belonging to category "Books" with price > 100
        List<Product> expensiveBooks = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equals("Books") && p.getPrice() > 100) {
                expensiveBooks.add(p);
            }
        }
        System.out.println("\nExercise 2 - Expensive Books (> $100):");
        expensiveBooks.forEach(System.out::println);


// Exercise 3: Obtain a list of products with category "Toys" and apply 10% discount
        List<Product> toys = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory().equals("Toys")) {
                double discountedPrice = p.getPrice() * 0.9; // 10% discount
                toys.add(p.withPrice(discountedPrice));
            }
        }
        System.out.println("\nExercise 3 - Toys with 10% Discount:");
        toys.forEach(System.out::println);


// Exercise 4: Get the cheapest products of "Books" category
        Product cheapestBook = null;
        for(Product p:products) {
            if(p.getCategory().equals("Books")) {
                if (cheapestBook == null || p.getPrice() < cheapestBook.getPrice()) {
                    cheapestBook = p;
                }
            }
        }
        System.out.println("\nExercise 4 - Cheapest Book:");
        System.out.println(cheapestBook);
    }
}
