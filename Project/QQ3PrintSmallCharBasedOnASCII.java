package Project;
public class QQ3PrintSmallCharBasedOnASCII {
    public static void main(String[] args) {
        String str = "MyNameisSagar";
        System.out.println(str);

        char smallest = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < smallest) {
                smallest = str.charAt(i);
            }
        }
        System.out.println("Value: " + (int) smallest);
    }
}
