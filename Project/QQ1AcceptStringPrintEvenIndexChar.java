package Project;
public class QQ1AcceptStringPrintEvenIndexChar {
    public static void main(String[] args) {
        String str = "My Name is Sagar...!";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
