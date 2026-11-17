import java.util.HashMap;

public class Student_Marks_Management_using_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Sagar");
        students.put(102, "Megha");
        students.put(103, "Rahul");
        students.put(104, "Amit");
        students.put(105, "Senha");

        // Print all student records using entrySet().
        System.out.println(students.entrySet());

        // Find the student with ID 103 using get().
        System.out.println(students.get(103));

        // Check whether ID 106 exists using containsKey().
        System.out.println(students.containsKey(106));

        // Update Rahul's name to Rahul Sharma.
        students.put(103, "Rahul Sharma");
        System.out.println(students.entrySet());

        // Remove student ID 104.
        students.remove(104);
        System.out.println(students.entrySet());

        // Print the total number of students using size().
        System.out.println(students.size());

        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
