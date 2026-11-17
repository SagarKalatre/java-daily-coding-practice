
import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        int num, sum = 0;
        
        System.out.println("Enter 5 Number : ");
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of 5 Number : " + sum);
    }
}
