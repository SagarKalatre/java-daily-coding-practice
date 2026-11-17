import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_duplicate_elements_in_an_ArrayList {
    public static void main(String[] args) {
        // 10, 20, 30, 10, 40, 20, 50, 30, 60, 10
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10);
        num.add(40);
        num.add(20);
        num.add(50);
        num.add(30);
        num.add(60);
        num.add(10);
        System.out.println(num);


        // Create two HashSets: unique and duplicate.
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        int count = 0;
         // Iterate through the ArrayList
        for (int i = 0; i < num.size(); i++) {
            int currect = num.get(i);
            // If already present in unique, add to duplicate
            if (unique.contains(currect)) {
                duplicate.add(currect);
                count++;
            } else {
                unique.add(currect);
            }
        }
        System.out.println("unique : " + unique);
        System.out.println("duplicate : " + duplicate);



        // Print all duplicate numbers.
        System.out.println("Total Duplicate Count " + count);
    }
}
