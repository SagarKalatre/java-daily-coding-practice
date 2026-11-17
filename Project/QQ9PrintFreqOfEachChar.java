package Project;
public class QQ9PrintFreqOfEachChar {
    // print the frequency of each character
    public static void main(String[] args) {
        String str = "My Name is Sagar...!";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(ch + " : " + count);
        }
    }
}
