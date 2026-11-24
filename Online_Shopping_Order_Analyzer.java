import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Online_Shopping_Order_Analyzer {
    public static void main(String[] args) {

        ArrayList<String> customers = new ArrayList<>(Arrays.asList(
            "Rahul", "Amit", "Priya", "Sneha", "Karan",
            "Neha", "Rohit", "Pooja"
        ));

        // Display all customer names.
        System.out.println(customers);
        
        
        // Store each customer's order amount in the HashMap.
        HashMap<String, Integer> orders = new HashMap<>();
        int[] amount = {2000, 3400, 1230, 4500, 1200, 5530, 1333, 1333};
        for (int i = 0; i < customers.size(); i++) {
            orders.put(customers.get(i), amount[i]);
        }
        
        
        // Display all customers with their order amounts.
        for (var cust : orders.entrySet()) {
            System.out.println(cust.getKey() + " : " + cust.getValue());
        }


        // Display customers whose order amount is greater than ₹5,000.
        for (var cust : orders.entrySet()) {
            if (cust.getValue() > 5000) {
                System.out.println("Customer is : " + cust.getKey());
            }
        }


        // Calculate the total sales amount.
        int sum = 0;
        for (var cust : orders.entrySet()) {
            sum += cust.getValue();
        }
        System.out.println("Total sales amount is : " + sum);


        // Calculate the average order amount.
        double total = 0;
        for (var cust : orders.entrySet()) {
            total += cust.getValue();
        }
        double avg = total / orders.size();
        System.out.println("Average order amount : " + avg);


        // Find the customer who placed the highest-value order.
        int highest = Integer.MIN_VALUE;
        String custName = "";
        for (var cust : orders.entrySet()) {
            if (cust.getValue() > highest) {
                highest = cust.getValue();
                custName = cust.getKey();
            }
        }
        System.out.println(custName + "'s Have Highest-value order : " + highest);


        // Search for a customer and display their order amount. If not found, display "Customer not found".
        boolean found = false;
        String name = "Rahul";
        for (var cust : orders.entrySet()) {
            if (cust.getKey().equals(name)) {
                System.out.println(name +"'s Order Amount is : " + cust.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer Not found...!");
        }


        // Display all unique order amounts using a HashSet and count how many unique amounts exist.
        HashSet<Integer> unique = new HashSet<>();
        int count = 0;
        for (var cust : orders.entrySet()) {
            if (unique.add(cust.getValue())) {
                count++;
            }
        }
        System.out.println(unique + " : "+count);
    }
}