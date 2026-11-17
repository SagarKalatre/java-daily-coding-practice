import java.util.ArrayList;
import java.util.List;

public class Number_Analyzer_using_ArrayList {
    public static void main(String[] args) {
        
        // ArrayList[] arr = {10, 25, 30, 15, 40, 25, 50, 10};
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(25);
        num.add(30);
        num.add(15);
        num.add(40);
        num.add(25);
        num.add(50);
        num.add(10);

        for (int n : num) {
            System.out.print(n + " ");
        }

        int sum = 0;

        for (int n : num) {
            sum += n;
        }
        System.out.println("\n"+sum);


        int cEven = 0;
        int cOdd = 0;
        for (int n : num) {
            if (n % 2 == 0) {
                cEven++;
            } else {
                cOdd++;
            }
        }
        System.out.println(cEven);
        System.out.println(cOdd);


        // Find the largest number without using Collections.max().
        int max = num.get(0);
        for (int i = 0 ; i < num.size(); i++) {
            if (num.get(i) > max) {
                max = num.get(i);
            }
        }
        System.out.println(max);



        int count = 0;
        for (int n : num) {
            if (n == 25) {
                count++;
            }
        }
        System.out.println("25 appears : " + count + " Times");
    }
}
