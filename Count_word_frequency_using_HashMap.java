import java.util.HashMap;

public class Count_word_frequency_using_HashMap {
    public static void main(String[] args) {
        String sentence = "java spring java hibernate spring java";

        // Split the sentence into words using split().
        String[] str = sentence.split(" ");



        // Create HashMap<String, Integer>
        HashMap<String, Integer> counts = new HashMap<>();
        // Count how many times each word appears.
        for (int i = 0; i < str.length; i++) {
            String words = str[i];
            if (counts.containsKey(words)) {
                int currentount = counts.get(words);
                counts.put(words, currentount + 1);
            } else {
                counts.put(words, 1);
            }
        }
        
        // Print all words with their frequency.
        // System.out.println(counts);     
         for (var entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Find the word that appears the most.
        String mostFreq = "";
        int maxCount = 0;
        for (String word : counts.keySet()) {
            int currectCount = counts.get(word);
            if (currectCount > maxCount) {
                maxCount = currectCount;
                mostFreq = word;
            }
        }
        System.out.println(mostFreq + " : " + maxCount);
    }
}
