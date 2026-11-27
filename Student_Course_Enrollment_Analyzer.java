import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Student_Course_Enrollment_Analyzer {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(Arrays.asList(
                "Rahul", "Amit", "Priya", "Sneha",
                "Karan", "Neha", "Rohit", "Pooja"
        ));

        // Display all student names.
        System.err.println(students);


        HashMap<String, ArrayList<String>> enrollments = new HashMap<>();
        // Store each student's enrolled courses in the enrollments HashMap.
        enrollments.put("Rahul", new ArrayList<>(Arrays.asList("Math", "Java")));
        enrollments.put("Amit", new ArrayList<>(Arrays.asList("Computer Science", "Math", "Java")));
        enrollments.put("Priya", new ArrayList<>(Arrays.asList("Java", "Python")));
        enrollments.put("Sneha", new ArrayList<>(Arrays.asList("Python", "Statistics")));
        enrollments.put("Karan", new ArrayList<>(Arrays.asList("Python", "Java")));
        enrollments.put("Neha", new ArrayList<>(Arrays.asList("English", "Python")));
        enrollments.put("Rohit", new ArrayList<>(Arrays.asList("Java", "Computer Science")));
        enrollments.put("Pooja", new ArrayList<>(Arrays.asList("Java", "Math")));
        
        
        
        // Display all students with their enrolled courses.
        System.out.println("\nCourse Enrollments:");
        for (String stud : students) {
            System.out.println(stud + " -> " + enrollments.get(stud));
        }


        // Display students enrolled in Java.
        for (String stud : students) {
            if (enrollments.containsKey(stud) && enrollments.get(stud).contains("Java")) {
                System.out.println("Students Enrolled for Java Course : " + stud);
            }
        }


        // Display students enrolled in more than 2 courses.
        for (String stud : students) {
            if (enrollments.containsKey(stud) && enrollments.get(stud).size() > 2) {
                System.out.println("Students Enrolled more then 2 Course : " + stud);
            }
        }


        // Count the total number of course enrollments.
        int totalEnrollments = 0;
        for (ArrayList<String> course : enrollments.values()) {
            totalEnrollments += course.size();
        }
        System.out.println("Total Number of Course Enrollments is : " + totalEnrollments);


        // Find the student enrolled in the maximum number of courses.
        int maximumNumCourses = Integer.MIN_VALUE;
        String name = "";
        for (String stud : enrollments.keySet()) {
            int currentCourseCount = enrollments.get(stud).size();
            if (currentCourseCount > maximumNumCourses) {
                maximumNumCourses = currentCourseCount;
                name = stud;
            }
        }
        System.out.println("Student with Maximum Course is : " + name + " (" + maximumNumCourses + ")");


        // Search for a particular course and display all students enrolled in it.
        String targetCourse = "Java";
        boolean found = false;
        for (String stud : enrollments.keySet()) {
            if (enrollments.get(stud).contains(targetCourse)) {
                System.out.println("Students enrolled is : " + stud);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students enrolled in " + targetCourse);
        }
    

        // Display all unique course names using HashSet.
        HashSet<String> unique = new HashSet<>();
        for (ArrayList<String> stud : enrollments.values()) {
            unique.addAll(stud);
        }
        System.out.println(unique);


        // Count how many students are enrolled in each course.
        HashMap<String, Integer> courseCount = new HashMap<>();
        for (ArrayList<String> courses : enrollments.values()) {
            for (String course : courses) {
                courseCount.put(course, courseCount.getOrDefault(course, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : courseCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
