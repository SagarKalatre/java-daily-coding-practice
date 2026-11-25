import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Student_Result_and_Performance_Analyzer {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList(
            "Rahul", "Amit", "Priya", "Sneha",
            "Karan", "Neha", "Rohit", "Pooja"
        ));
        
        // Display all student names.
        System.out.println(students);

        
        // Store each student's marks in the HashMap.
        HashMap<String, Integer> marks = new HashMap<>();
        int[] mark = {90, 40, 25, 68, 89, 67, 88, 88};
        for (int i = 0; i < students.size(); i++) {
            marks.put(students.get(i), mark[i]);
        }
        System.out.println(marks);


        // Display all students with their marks.
        for (var stud : marks.entrySet()) {
            System.out.println(stud.getKey() + " = " + stud.getValue());
        }


        // Display students who scored 75 or above.
        for (var stud : marks.entrySet()) {
            if (stud.getValue() >= 75) {
                System.err.println("Student above 75 marks is : " + stud.getKey() + " = " + stud.getValue());
            }
        }


        // Display students who failed (marks below 35).
        for (var stud : marks.entrySet()) {
            if (stud.getValue() < 35) {
                System.err.println("Failed Student are : " + stud.getKey() + " = " + stud.getValue());
            }
        }


        // Calculate the total marks and average marks.
        double sum = 0;
        for (var stud : marks.entrySet()) {
            sum += stud.getValue();
        }
        double avg = sum / marks.size();
        System.out.println("Total marks is : " + sum);
        System.out.println("Avarge marks is : " + avg);


        // Find the highest-scoring student and their marks.
        int highest = Integer.MIN_VALUE;
        String name = "";
        for (var stud : marks.entrySet()) {
            if (stud.getValue() > highest) {
                highest = stud.getValue();
                name = stud.getKey();
            }
        }
        System.out.println("highest-scoring student are : " + name + " = " + highest);


        // Search for a student and display their marks. If not found, display "Student not found".
        String studName = "Rohit";
        boolean found = false;
        for (var stud : marks.entrySet()) {
            if (stud.getKey().equals(studName)) {
                System.out.println("Student Found...! and it marks is : " + stud.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found..!");
        }


        // Display all unique marks using a HashSet and count how many unique marks exist.
        HashSet<Integer> unique = new HashSet<>();
        int count = 0;
        for (var stud : marks.entrySet()) {
            if (unique.add(stud.getValue())) {
                count++;
            }
        }
        System.out.println("Unique Marks is : " + unique);
        System.out.println("Total Count is : " + count);
    }
}
