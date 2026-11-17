package Project;
public class QQ8PrintFirstRepeatedChar {
    public static void main(String[] args) {

        //print the first repeated character
        String str = "My Name is Sagar...!";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            // char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.indexOf(i) == str.lastIndexOf(j)) {
                    System.out.println("First Repeated Char : " + str.charAt(i));
                    return;
                }
            }
        }
    }
}
