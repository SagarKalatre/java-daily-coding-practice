import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Employee_Salary_Department_Analyzer {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>(Arrays.asList(
                "Rahul", "Amit", "Priya", "Sneha",
                "Karan", "Neha", "Rohit", "Pooja"));

        HashMap<String, Integer> salaries = new HashMap<>();
        HashMap<String, String> departments = new HashMap<>();

        // Display all employee names.
        System.out.println(employees);


        // Store each employee's salary in the salaries HashMap.
        int[] salary = { 45000, 23000, 10000, 54000, 34000, 30000, 56000, 70000 };
        for (int i = 0; i < employees.size(); i++) {
            salaries.put(employees.get(i), salary[i]);
        }
        System.out.println(salaries);


        // Store each employee's department in the departments HashMap.
        String[] dept = { "IT", "IT", "Intern", "Engineering", "Marketing", "HR", "Finance", "Management" };
        for (int i = 0; i < employees.size(); i++) {
            departments.put(employees.get(i), dept[i]);
        }
        System.out.println(departments);


        // Display all employees with their salaries and departments.
        for (var emp : salaries.entrySet()) {
            String name = emp.getKey();
            int sal = emp.getValue();
            String dep = departments.get(name);
            System.out.printf("%-10s | %-12s | ₹%,d%n", name, dep, sal);
        }

        // for (String name : employees) {
        // System.out.println(name + " = " + salaries.get(name) + " = " +
        // departments.get(name));
        // }



        // Display employees whose salary is greater than ₹30,000.
        for (var emp : salaries.entrySet()) {
            if (emp.getValue() > 30000) {
                System.out.println("Employee Salary Greater than ₹30,000 are " + emp.getKey());
            }
        }

        // Calculate the total salary expense of the company.
        double sum = 0;
        for (var emp : salaries.entrySet()) {
            sum += emp.getValue();
        }
        System.out.println("Total Salary expense of the company is " + sum);


        // Calculate the average employee salary.
        double avg = sum / employees.size();
        System.out.println("Average employee salary is " + avg);


        // Find the employee receiving the highest salary and display their department.
        int highest = Integer.MIN_VALUE;
        String highestEmp = "";
        for (var emp : salaries.entrySet()) {
            if (emp.getValue() > highest) {
                highest = emp.getValue();
                highestEmp = emp.getKey();
            }
        }
        String employeDept = departments.get(highestEmp);
        // System.out.println("Highest Paid ₹" + highest + " : " + employeDept);
        System.out.println("Highest Paid Employee: " + highestEmp + " | Salary: ₹" + highest + " | Department: " + employeDept);
        

        // Search for an employee and display their salary and department. If not found, display "Employee not found".
        String name = "Rahul";
        boolean found = false;
        for (var emp : salaries.entrySet()) {
            if (emp.getKey().equals(name)) {
                System.out.println("Employee Found...! And Salary is : " + emp.getValue() + ", Department is : " + departments.get(name));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee Not Found...!");
        }


        // Display all unique department names using a HashSet and count how many unique departments exist.
        // HashSet<String> unique = new HashSet<>();
        // int count = 0;
        // for (var dep : departments.entrySet()) {
        //     if (unique.add(dep.getValue())) {
        //         count++;
        //     }
        // }
        // System.out.println(unique + " : " + count);


        // Display all unique department names using a HashSet and count how many unique departments exist.
        HashSet<String> uniqueDepartments = new HashSet<>(departments.values());

        System.out.println("Unique Departments: " + uniqueDepartments);
        System.out.println("Total Unique Count: " + uniqueDepartments.size());
    }
}
