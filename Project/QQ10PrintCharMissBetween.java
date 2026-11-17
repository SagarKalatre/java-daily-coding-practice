package Project;
public class QQ10PrintCharMissBetween {
    // Print the character missing between the smallest and largest characters
    public static void main(String[] args) {
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

        System.out.println("Smallest Character: " + smallest + " : " + (int) smallest);
        System.out.println("Largest Character: " + largest + " : " + (int) largest);

        System.out.println("Missing Characters between Smallest and Largest:");
        for (char ch = (char) ((int) smallest + 1); ch < largest; ch++) {
            System.out.print(ch + " ");
        }
    }
}
