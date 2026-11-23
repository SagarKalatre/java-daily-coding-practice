import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Bank_Transaction_Analyzer {
    public static void main(String[] args) {
        ArrayList<String> customer = new ArrayList<>(Arrays.asList(
            "Rahul", "Amit", "Priya", "Sneha", "Karan",
            "Neha", "Rohit", "Pooja"
        ));
        
        // Display all customer names.
        System.out.println(customer);
        
        
        // Store each customer's transaction amount in the HashMap.
        int[] amounts = {50000, 3200, 7500, 15000, 4200, 6100, 3200, 8400};
        HashMap<String, Integer> transactions = new HashMap<>();
        
        for (int i = 0; i < customer.size(); i++) {
            transactions.put(customer.get(i), amounts[i]);
        }
        System.out.println(transactions);


        // Display all customers with their transaction amounts.
        for (var cust : transactions.entrySet()) {
            System.out.println(cust.getKey() + " : " + cust.getValue());
        }


        // Display customers whose transaction amount is greater than ₹10,000.
        for (var cust : transactions.entrySet()) {
            if (cust.getValue() > 10000) {
                System.out.println("transaction greater than ₹10,000"+ cust.getKey() + " : ₹" + cust.getValue());
            }
        }


        // Calculate the total transaction amount of all customers.
        int sum = 0;
        for (var cust : transactions.entrySet()) {
            sum += cust.getValue();
        }
        System.out.println("Total transaction amount of all customers is : " + sum);


        // Find the customer who made the highest transaction.
        int highest = Integer.MIN_VALUE;
        String topCustomer = "";
        for (var cust : transactions.entrySet()) {
            if (cust.getValue() > highest) {
                highest = cust.getValue();
                topCustomer = cust.getKey();
            }
        }
        System.out.println("Highest Transaction: " + topCustomer + " with " + highest);


        // Search for a particular customer and display their transaction amount. If not found, display "Customer not found".
        boolean found = false;
        String pCustomer = "Amit";
        for (var cust : transactions.entrySet()) {
            if (pCustomer.equals(cust.getKey())) {
                System.out.println("Customer " +cust.getKey() + "'s transaction amount : " + cust.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer not found");
        }


        // Display all unique transaction amounts using a HashSet.
        HashSet<Integer> unique = new HashSet<>();
        int count = 0;
        for (var cust : transactions.entrySet()) {
            if (unique.add(cust.getValue())) {
                unique.add(cust.getValue());
                count++;
            }
        }
        System.out.println("Unique transaction : " + unique + " Total Count is : " + count);
    }
}
