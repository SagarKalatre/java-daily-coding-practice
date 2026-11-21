import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate_Number_Analyzer {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(10); 
        numbers.add(40);
        numbers.add(55);
        numbers.add(25); 
        numbers.add(70);
        numbers.add(85);
        numbers.add(10); 
        numbers.add(100);

        // Display all numbers.
        System.out.println(numbers);


        // Find and display duplicate numbers.
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println("duplicate numbers : " + duplicate);
        

        // Count total duplicate occurrences.
        HashSet<Integer> duplicate_occures = new HashSet<>();
        int count = 0;
        for (int num : numbers) {
            if (!duplicate_occures.add(num)) {
                count++;
            }
        }
        System.out.println("Total Duplicate Numbers : " + count);


        // Display only unique numbers.
        HashSet<Integer> unique = new HashSet<>();
        // HashSet<Integer> GetUnique = new HashSet<>();
        for (int num : numbers) {
            unique.add(num);
            // if (unique.add(num)) {
            //     GetUnique.add(num);
            // }
        }
        System.out.println("Unique Number : " + unique);
        // System.out.println("Unique Number : " + GetUnique);


        // Count how many unique numbers exist.
        HashSet<Integer> unique_count = new HashSet<>();
        int count_uniques = 0;
        for (int num : numbers) {
            if (unique_count.add(num)) {
                count_uniques++;
            }
        }
        System.out.println("Count Unique Number : " + count_uniques);


        // Find the largest number.
        int largest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("largest Number : " + largest);


        // Find the smallest number.
        int smallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest Number : " + smallest);



        // Calculate the sum of unique numbers.
        HashSet<Integer> totalCountUnique = new HashSet<>();
        int total_Count_Unique = 0;
        for (int num : numbers) {
            if (totalCountUnique.add(num)) {
                total_Count_Unique += num;
            }
        }
        System.out.println("sum of unique numbers : " + total_Count_Unique);
    }
}
