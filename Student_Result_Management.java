import java.util.HashMap;

public class Student_Result_Management {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        // nsert 6 students with their marks.
        students.put("Sagar", 81);
        students.put("Omkar", 82);
        students.put("Jeevan", 89);
        students.put("Vishal", 90);
        students.put("Sai", 27);
        students.put("Manoj", 45);

        // Display all students and marks using entrySet().
        System.out.println(students.entrySet());
                
        
        // Display students who scored 75 or above.
        for (var stud : students.entrySet()) {
            if (stud.getValue() >= 75) {
                System.out.println("Student Scored 75 : " + stud);
            }
        }
        
        
        // Display students who failed (marks below 35).
        for (var stud : students.entrySet()) {
            if (stud.getValue() < 35) {
                System.out.println("Student Faild below 35 : " + stud);
            }
        }
        
        
        // Find the highest scorer and their marks.
        int highScore = Integer.MIN_VALUE;
        String name = "";
        for (var stud : students.entrySet()) {
            if (stud.getValue() > highScore) {
                highScore = stud.getValue();
                name = stud.getKey();
            }
        }
        System.out.println("Student Who Highest Score : " + name + " = " + highScore);
        
        
        // Find the lowest scorer and their marks.
        int lowerScore = Integer.MAX_VALUE;
        String names = "";
        for (var stud : students.entrySet()) {
            if (stud.getValue() < lowerScore) {
                lowerScore = stud.getValue();
                names = stud.getKey();
            }
        }
        System.out.println("Student Who Lowerst Score : " + names + " = " + lowerScore);
        
        
        // Count how many students passed and failed.
        int countPass = 0;
        int countFail = 0;
        for (var stud : students.entrySet()) {
            if (stud.getValue() >= 35) {
                countPass++;
            } else {
                countFail++;
            }
        }
        System.out.println("Student Pased Count : " + countPass);
        System.out.println("Student Failed Count :  " + countFail);
        
        
        // Calculate the total and average marks.
        int sum = 0, counts = 0;
        for (var stud : students.entrySet()) {
            sum += stud.getValue();
            counts++;
        }
        double avg = sum / students.size();
        System.out.println("Total count is " + counts);
        System.out.println("Avarage is : " + avg);
        
        
        // Search for a student by name and display their marks. If not found, print "Student Not Found".
        String n = "";
        boolean found = false;
        for (var stud : students.entrySet()) {
            if (stud.getKey().equalsIgnoreCase("Sagar")) {
                System.out.println(n = stud.getKey() + " : " + stud.getValue());
                found = true;
                break;
            } 
        } 
        if (!found) {
            System.out.println("Student Not found...!");
        }

    }   
}
