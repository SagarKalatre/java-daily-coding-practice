package Project;
public class QQ4PrintSumOfASCII {
    public static void main(String[] args) {
        // print the sum of ascii values of the smallest and largest characters.
        String str = "MyNameisSagar";
        System.out.println(str);

        char smallest = str.charAt(0);
        char largest = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < smallest) {
                smallest = str.charAt(i);
            }
            if (str.charAt(i) > largest) {
                largest = str.charAt(i);
            }
        }

        int sum = (int) smallest + (int) largest;
        System.out.println("Smallest ASCII: " + smallest + " : " + (int) smallest);
        System.out.println("Largest ASCII: " + largest + " : " + (int) largest);
        System.out.println("Sum of ASCII values: " + sum);

        // for (char ch = 'A'; ch <= 'Z'; ch++) {
        //     System.out.println(ch + " : " + (int) ch);
        // }
    }
}
