
public class Students {
    // You have a list of students. Each student has:
    // - Student ID
    // - Student Name
    // - Department
    // - Marks
    // Your task is to create a Java program that analyzes student performance.

    // Requirements:
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

    private int studentId;
    private String name;
    private String dept;
    private double mark;

    public int getStudentId() {
        return studentId;
    }

    public Students(int studentId, String name, String dept, double mark) {
        this.studentId = studentId;
        this.name = name;
        this.dept = dept;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Students [studentId=" + studentId + ", name=" + name + ", dept=" + dept + ", mark=" + mark + "]";
    }

    public Students() {
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}
