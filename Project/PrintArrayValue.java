package Project;


public class PrintArrayValue {
    int[] arr = {2, 5, 3, 7, 1, 6, 8};

    public void printArrayValues() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        PrintArrayValue p1 = new PrintArrayValue();
        p1.printArrayValues();
    }
}
