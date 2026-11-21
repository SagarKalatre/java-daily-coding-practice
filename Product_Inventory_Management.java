import java.util.HashMap;

public class Product_Inventory_Management {
    public static void main(String[] args) {
        HashMap<String, Integer> productQuantity = new HashMap<>();
        productQuantity.put("Laptop", 25);
        productQuantity.put("Mobile", 31);
        productQuantity.put("Watch", 10);
        productQuantity.put("Mouse", 9);
        productQuantity.put("Keyboard", 26);

        // Display all products.
        System.out.println(productQuantity.entrySet());


        // Add 10 units to an existing product.
        for (var prod : productQuantity.entrySet()) {
            
            if (prod.getKey().equalsIgnoreCase("Watch")) {
                int newQty = prod.getValue() + 10;
                prod.setValue(newQty);
                System.out.println(prod.getKey() + " Updated Value : " + newQty);
            }
        }


        // Remove a product.
        productQuantity.remove("Watch");
        System.out.println(productQuantity);


        // Find products with quantity below 10.
        for (var prod : productQuantity.entrySet()) {
            if (prod.getValue() < 10) {
                System.out.println("products with quantity below 10 : " + prod);
            }
        }


        // Calculate the total quantity of all products.
        int sum = 0;
        for (var prod : productQuantity.entrySet()) {
            sum += prod.getValue();
        }
        System.out.println(sum);

        int total = 0;
        for (var prod : productQuantity.values()) {
            total += prod;
        }
        System.out.println(total);


        // Check whether "Laptop" exists.
        boolean exists = false;
        for (var prod : productQuantity.entrySet()) {
            if (prod.getKey().equalsIgnoreCase("Laptop")) {
                exists = true;
            }
        }
        System.out.println("Laptop Found : " + exists);
    }
}
