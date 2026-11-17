package Project;
public class Q5AcptArrPtMissNo {
    public static void main(String[] args) {
        int[] arr = {11, 12, 14, 16};
        
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int j = arr[i] + 1;
            while (j < arr[i + 1]) {
                System.out.println("Missing Values are -: " + j++ + " ");
            }
        }
    }
}
