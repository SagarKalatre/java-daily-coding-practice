import java.util.HashMap;

public class Employee_Salary_Analyzer {
    public static void main(String[] args) {

        HashMap<String, Integer> employees = new HashMap<>();
        // Insert 5 employees with their salaries.
        employees.put("Omkar", 40000);
        employees.put("Jeevan", 44000);
        employees.put("Vishal", 50000);
        employees.put("Naresh", 22000);
        employees.put("Ashish", 25000);


        // Display all employees using entrySet().
        for (var emp : employees.entrySet()) {
            // System.out.println(emp.getKey() + " = " + emp.getValue());
            System.out.println(emp);
        }


        // Display employees whose salary is greater than 30,000.
        for (var emp : employees.entrySet()) {
            if (emp.getValue() > 30000) {
                System.out.println("This Employee Have Greater the 30K Salary : " + emp);
            }
        }


        // Calculate the total salary.
        double total = 0;
        for (var emp : employees.entrySet()) {
            total += emp.getValue();
        }
        System.out.println("\nTotal Salary is : " + total);


        // Calculate the average salary.
        double sum = 0;
        for (var emp : employees.entrySet()) {
            sum += emp.getValue();
        }
        double avg = sum / employees.size();
        System.err.println(avg);


        // Find the employee with the highest salary.
        int highest = Integer.MIN_VALUE;
        String name = "";
        for (var emp : employees.entrySet()) {
            if (emp.getValue() > highest) {
                highest = emp.getValue();
                name = emp.getKey();
            }
        }
        System.out.println("Highest Salary Employee Mr. " + name + " : " + highest);


        // Count employees whose salary is 25,000 or above.
        int count = 0;
        for (var emp : employees.entrySet()) {
            if (emp.getValue() >= 25000) {
                count++;
            }
        }
        System.out.println(count);


        // Check whether an employee named "Rahul" exists.
        boolean exists = false;
        for (var emp : employees.entrySet()) {
            if (emp.getKey().equalsIgnoreCase("Rahul")) {
                exists = true;
                break;
            }
        }
        System.out.println("Rahul Exists : " + exists);

    }
}
