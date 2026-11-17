import java.util.HashMap;

public class Student_Marks_Analyzer {
    public static void main(String[] args) {
        // Sagar  = 85
        // Rahul  = 72
        // Priya  = 95
        // Amit   = 65
        // Sneha  = 88

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Sagar", 85);
        students.put("Rahul", 72);
        students.put("Priya", 95);
        students.put("Amit", 65);
        students.put("Senha", 88);
        
        // System.out.println(students.entrySet());


        // Display all students using entrySet().
        System.out.println("Students:");
        for (var stud : students.entrySet()) {
            System.out.println(stud.getKey() + " = " + stud.getValue());
        }


        // Find students who scored more than 80.
        System.out.println("\nStudents Above 80:");
        for (var stud : students.entrySet()) {
            if (stud.getValue() > 80) {
                System.out.println(stud);
            }
        }


        // Calculate the total marks of all students.
        int sum = 0;
        for (var stud : students.entrySet()) {
            sum += stud.getValue();
        }
        System.out.println("\nTotal Marks: " + sum);


        // Calculate the average marks.
        int count = 0;
        for (var stud : students.entrySet()) {
            count += stud.getValue();
        }
        double avg = count / students.size();
        System.out.println("Average Marks: " + avg);


        // Find the highest scorer.
        int highest = Integer.MIN_VALUE;
        String name = "";
        for (var stud : students.entrySet()) {
            // highest = Math.max(stud.getValue(), stud.getValue());
            if (stud.getValue() > highest) {
                highest = stud.getValue();
                name = stud.getKey();
            }
        }
        System.out.println("\nHighest Scorer : " + name);
        System.out.println("Highest Marks : " + highest);


        // Count how many students passed (marks 75 or above).
        int Passed = 0;
        for (var stud : students.entrySet()) {
            if (stud.getValue() >= 75) {
                Passed++;
            }
        }
        System.out.println("\nPassed Students : " + Passed);


        // Find whether a student named Karan exists.
        boolean exists = false;
        for (var stud : students.entrySet()) {
            if (stud.getKey().equalsIgnoreCase("Kiran")) {
                exists = true;
                break;
            }
        }
        System.out.println("Karan Exists: " + exists);
        
        


    }
    
}
