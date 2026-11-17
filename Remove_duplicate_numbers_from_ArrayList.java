import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_duplicate_numbers_from_ArrayList {
    public static void main(String[] args) {

        // 10, 20, 30, 10, 40, 20, 50, 30, 60
        // Store all numbers in an ArrayList.
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
        System.out.println("Original List    : " + num);

        
        // Store all numbers in an ArrayList.
        Set<Integer> nums = new HashSet<>();
        // Remove duplicate numbers using HashSet.
        for (int i = 0; i < num.size(); i++) {
            nums.add(num.get(i));
        }
        System.out.println("Remove duplicate : " + nums);


        // int total = 0;
        // for (int n : num) {
        //     total++;
        // }
        System.out.println("Total Original Elements : " + num.size());


        // Print unique numbers.
        // int count = 0;
        // for (int n : nums) {
        //     count++;
        // }
        System.out.println("Total Unique Elements : " + nums.size());


        // Count how many duplicate numbers were removed.
        int remove = num.size() - nums.size();
        System.out.println("Duplicates Removed : " + remove);

    }
}
