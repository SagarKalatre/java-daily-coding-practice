package Project;
public class QQ5PrintMissingChar {
    public static void main(String[] args) {
        // print the missing character from the given alphabet sequence
        
        // String str = "a b d g h k m n q r s t u v x z";
        // System.out.println(str);

        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == ' ') {
        //         System.out.print(" ");
        //     } else {
        //         System.out.print((char) (str.charAt(i) + 1));
        //     }
        // }

        
        String str = "My Name is Sagar...!";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print((char) (str.charAt(i) + 1));
            }
        }
    }

}
