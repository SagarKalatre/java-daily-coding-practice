import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Word_Frequency_Analyzer {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
            "apple", "banana", "cherry", "apple", "date",
            "elderberry", "banana", "fig", "grape", "apple"
        ));

        // Display all words.
        System.out.println(words);
        System.out.println(words.size());


        // Count how many times each word appears using HashMap.
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();
        for (String w : words) {
            if (!seen.add(w)) {
                duplicate.add(w);
            }
        }
        System.out.println("Duplicate Words : " + duplicate);


        // Display words that appear more than once.
        for (String dup : duplicate) {
            System.out.println("That words appear more than once : " + dup);
        }


        // Find the most frequently occurring word.
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }
        String mostFrequently = "";
        int maxCount = 0;
        for (String w : wordCount.keySet()) {
            int count = wordCount.get(w);
            if (count > maxCount) {
                maxCount = count;
                mostFrequently = w;
            }
        }
        System.out.println("Most Frequent Word : " + mostFrequently);
        System.out.println("Maximum Count : " + maxCount);


        // Find the least frequently occurring word.
        String leastFrequently = "";
        int minCount = Integer.MAX_VALUE;
        for (String w : wordCount.keySet()) {
            int count = wordCount.get(w);
            if (count < minCount) {
                minCount = count;
                leastFrequently = w;
            }
        }
        System.out.println("Least Frequent Word : " + leastFrequently);
        System.out.println("Minimum Count : " + minCount);


        // Calculate the total number of words.
        System.out.println("Total Number : " + words.size());


        // Search for a particular word and display its frequency.
        // HashSet<String> duplicate_occuress = new HashSet<>();
        // String dup = "";
        String word = "apple";
        int count = 0;
        for (String w : words) {
            if (word.equals(w)) {
                count++;
            }
            // if (!duplicate_occuress.add(w)) {
            //     count++;
            // }
        }
        System.out.println(word +  " frequency is : " + count);


        // Display only unique words.
        HashSet<String> unique = new HashSet<>();
        for (String w : words) {
            unique.add(w);
        }
        System.out.println("Unique word : " + unique);
    }   
}
