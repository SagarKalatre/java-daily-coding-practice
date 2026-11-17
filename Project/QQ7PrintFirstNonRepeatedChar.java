package Project;
public class QQ7PrintFirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "My Name is Sagar...!";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non Repeated Chara : " + ch);
                break;
            }
        }
    }
}
