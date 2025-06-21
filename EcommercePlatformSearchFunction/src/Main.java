import java.util.*;
public class Main {
        public static void main(String[] args) {
            Product[] products = {
                    new Product(101, "Laptop", "Electronics"),
                    new Product(205, "Shirt", "Clothing"),
                    new Product(150, "Watch", "Accessories"),
                    new Product(303, "Mobile", "Electronics")
            };

            // Sort array for binary search
            Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

            int searchId = 150;

            // Linear Search
            Product result1 = SearchProduct.linearSearch(products, searchId);
            System.out.println("Linear Search:");
            System.out.println(result1 != null ? result1.productName : "Product not found");

            // Binary Search
            Product result2 = SearchProduct.binarySearch(products, searchId);
            System.out.println("Binary Search:");
            System.out.println(result2 != null ? result2.productName : "Product not found");
        }

}
