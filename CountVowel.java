import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        // String str = "Hello, welcome to the world of Java programming!";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter A Strign : "));
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
