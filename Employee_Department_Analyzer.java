import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Employee_Department_Analyzer {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>(Arrays.asList(
                "Rahul", "Amit", "Priya", "Sneha", "Karan",
                "Neha", "Rohit", "Pooja"));

        HashMap<String, String> departments = new HashMap<>();

        // Display all employee names.
        System.out.println(employees);


        // Store each employee's department in the HashMap.
        departments.put(employees.get(0), "IT");       
        departments.put(employees.get(1), "Manager");  
        departments.put(employees.get(2), "HR");       
        departments.put(employees.get(3), "Finance");  
        departments.put(employees.get(4), "Sales");    
        departments.put(employees.get(5), "IT");       
        departments.put(employees.get(6), "Marketing");
        departments.put(employees.get(7), "HR"); 
        
        System.out.println(departments);



        // Display all employees with their departments.
        for (var emp : departments.entrySet()) {
            System.out.println(emp.getKey() + " : " + emp.getValue());
        }


        // Display only employees working in the "IT" department.
        for (var emp : departments.entrySet()) {
            if (emp.getValue().equals("IT")) {
                System.out.println("Employee Work in IT Dept : " + emp.getKey() + " : " + emp.getValue());
            }
        }


        // Count how many employees work in each department.
        HashMap<String, Integer> deptCount = new HashMap<>();
        for (String emp : departments.values()) {
            deptCount.put(emp, deptCount.getOrDefault(emp, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        // Find the department having the maximum number of employees.
        String maxDept = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> dept : deptCount.entrySet()) {
            if (dept.getValue() > maxCount) {
                maxCount = dept.getValue();
                maxDept = dept.getKey();
            }
        }
        System.out.println("Dept with Max Employees is " + maxDept + " : " + maxCount);


        // Search for an employee and display their department. If not found, display "Employee not found".
        String emply = "Rahul";
        if (departments.containsKey(emply)) {
            System.out.println(emply + "'s Department " + departments.get(emply));
        } else {
            System.out.println("Employee Not Found..!");
        }
        // String emply = "Amit";
        // boolean found = false;
        // for (var emp : departments.entrySet()) {
        //     if (emply.equals(emp.getKey())) {
        //         System.out.println("Employee Found! Department : " + emp.getValue());
        //         found = true;
        //         break;
        //     }
        // }
        // if (!found) {
        //     System.out.println("Employee Not Found...!");
        // }


        // Display all unique department names using a HashSet.
        HashSet<String> unique = new HashSet<>();
        for (var emp : departments.entrySet()) {
            unique.add(emp.getValue());
        }
        System.out.println("Unique Departments : " + unique);
    }
}