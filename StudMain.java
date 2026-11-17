import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StudMain {

    // 1. Create a Student class with the above properties.
    // 2. Store at least 10 students using ArrayList.
    // 3. Find the student with the highest marks.
    // 4. Find the student with the second-highest marks.
    // 5. Group students according to their department using HashMap.
    // 6. Find duplicate student names using HashSet.
    // 7. Sort students by marks in descending order using Comparator.
    // 8. Display students who scored more than 75 marks.
    // 9. Calculate the average marks of each department.
    // 10. Find the department with the highest average marks.

    public static void main(String[] args) {

        List<Students> stud = new ArrayList<>();

        stud.add(new Students(101, "Sagar", "CS", 94.5));
        stud.add(new Students(102, "Priya", "IT", 88.0));
        stud.add(new Students(103, "Rahul", "ENTC", 72.0));
        stud.add(new Students(104, "Sneha", "CS", 91.5));
        stud.add(new Students(105, "Sagar", "MECH", 65.0));
        stud.add(new Students(106, "Amit", "IT", 79.0));
        stud.add(new Students(107, "Neha", "ENTC", 84.5));
        stud.add(new Students(108, "Vikram", "MECH", 75.0));
        stud.add(new Students(109, "Priya", "CS", 68.0));
        stud.add(new Students(110, "Karan", "IT", 89.0));

        // // Find the student with the highest marks.
        for (Students s : stud) {
            System.out.println(s);
        }

        // Students highest = null;
        // for (Students s : stud) {
        // if (highest == null || s.getMark() > highest.getMark()) {
        // highest = s;
        // }
        // }
        // System.out.println("\nHighest Marks : " + highest);

        // Students secondHighest = null;
        // for (Students s : stud) {
        // if (s != highest && (secondHighest == null || s.getMark() >
        // secondHighest.getMark())) {
        // secondHighest = s;
        // }
        // // if (highest == null || s.getMark() > highest.getMark()) {
        // // secondHighest = highest;
        // // highest = s;
        // // } else if (secondHighest == null || s.getMark() > secondHighest.getMark())
        // {
        // // secondHighest = s;
        // // }
        // }
        // System.out.println("\nSecond Highest: " + secondHighest);

        // // Group students according to their department using HashMap.
        // HashMap<String, ArrayList<Students>> map = new HashMap<>();
        // for (Students s : stud) {
        // String dept = s.getDept();
        // if (map.containsKey(dept)) {
        // ArrayList<Students> list = map.get(dept);
        // list.add(s);
        // } else {
        // ArrayList<Students> list = new ArrayList<>();
        // list.add(s);
        // map.put(dept, list);
        // }
        // }
        // for (String dept : map.keySet()) {
        // System.out.println("\n Department : " + dept);
        // for (Students s : map.get(dept)) {
        // System.out.println(" - " + s.getStudentId() + " " + s.getName());
        // // System.out.println(" - " + s.getName());
        // }
        // }
        // System.out.println("\n" + map);

        // Find duplicate student names using HashSet.
        // HashSet<String> set = new HashSet<>();
        // for (Students s : stud) {
        // String name = s.getName();
        // if (!set.add(name)) {
        // System.out.println("\n Deplicate Name : " + name);
        // }
        // }

        // Sort students by marks in descending order using Comparator.
        // Comparator<Students> comp = new Comparator<Students>() {

        // @Override
        // public int compare(Students s1, Students s2) {

        // return Double.compare(s1.getMark(), s2.getMark());
        // }
        // };
        // // Collections.sort(stud, comp);
        // for (int i = 0; i < stud.size(); i++) {
        // for (int j = i + 1; j < stud.size(); j++) {
        // if (comp.compare(stud.get(i), stud.get(j)) < 0) {
        // Students temp = stud.get(i);
        // stud.set(i, stud.get(j));
        // stud.set(j, temp);
        // }
        // }
        // }
        // for (Students s : stud) {
        // System.out.println(s.getName() + " - " + s.getMark());
        // }

        // Display students who scored more than 75 marks.
        for (Students s : stud) {
            if (s.getMark() > 75) {
                System.out.println(s.getName() + " - " + s.getMark());
            }
        }

        // Calculate the average marks of each department.
        // Calculate the average marks of each department.

        // HashMap<String, Double> totalMarks = new HashMap<>();
        // HashMap<String, Integer> count = new HashMap<>();

        // Step 1: Calculate total marks and student count

        // for (Students s : stud) {

        // String dept = s.getDept();
        // double marks = s.getMark();

        // if (totalMarks.containsKey(dept)) {

        // totalMarks.put(dept, totalMarks.get(dept) + marks);

        // count.put(dept, count.get(dept) + 1);

        // } else {

        // totalMarks.put(dept, marks);

        // count.put(dept, 1);
        // }
        // }

        // // Step 2: Calculate and display average

        // for (String dept : totalMarks.keySet()) {

        // double total = totalMarks.get(dept);
        // int studentCount = count.get(dept);

        // double average = total / studentCount;

        // System.out.println(dept + " = " + average);
        // }

        // // Find the department with the highest average marks.
        // String highestDept = null;
        // double highestAverage = 0;
        // for (String dept : totalMarks.keySet()) {
        // double average = totalMarks.get(dept) / count.get(dept);
        // if (highestDept == null || average > highestAverage) {
        // highestAverage = average;
        // highestDept = dept;
        // }
        // }

        // System.out.println("\nHighest Average Department: " + highestDept);
        // System.out.println("Average Marks: " + highestAverage);
    }
}
