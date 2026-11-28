import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Employee_Project_Assignment_Analyzer {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>(Arrays.asList(
                "Rahul", "Amit", "Priya", "Sneha",
                "Karan", "Neha", "Rohit", "Pooja"
        ));

        // Display all employee names. 
        System.out.println(employees);
        
        
        HashMap<String, ArrayList<String>> projects = new HashMap<>();
        // Store each employee's projects in the projects HashMap.
        projects.put("Rahul", new ArrayList<>(Arrays.asList("Banking", "API Integration")));
        projects.put("Amit", new ArrayList<>(Arrays.asList("Database Migration", "Security Audit")));
        projects.put("Priya", new ArrayList<>(Arrays.asList("Mobile App", "Banking")));
        projects.put("Sneha", new ArrayList<>(Arrays.asList("UI/UX Prototype", "Design System", "Banking")));
        projects.put("Karan", new ArrayList<>(Arrays.asList("Banking", "Payment Gateway")));
        projects.put("Neha", new ArrayList<>(Arrays.asList("Data Analytics", "Reporting Tool", "Security Audit")));
        projects.put("Rohit", new ArrayList<>(Arrays.asList("DevOps Pipeline", "Server Monitoring")));
        projects.put("Pooja", new ArrayList<>(Arrays.asList("QA Automation", "Banking")));
        

        // Display all employees with their assigned projects.
        for (String emp : employees) {
            System.out.println(emp + " : " + projects.get(emp));
        }


        // Display employees assigned to the Banking project.
        System.out.println("\n Display employees assigned to the Banking project");
        for (Map.Entry<String, ArrayList<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains("Banking")) {
                System.out.print(entry.getKey() + ", ");                
            }
        }


        // Display employees assigned to more than 2 projects.
        System.out.println();
        for (Map.Entry<String, ArrayList<String>> emp : projects.entrySet()) {
            if (emp.getValue().size() > 2) {
                System.out.println(emp.getKey() + " : " + emp.getValue().size() + " Projects");
            }
        }


        // Calculate the total number of project assignments.
        int totalAssignments = 0;
        for (ArrayList<String>  project : projects.values()) {
            totalAssignments += project.size();
        }
        System.out.println("Total Number of Project Assignment is : " + totalAssignments);


        // Find the employee assigned to the maximum number of projects.
        int maximumNumPro = Integer.MIN_VALUE;
        String name = "";

        for (String emp : projects.keySet()) {
            int currentProjectCount = projects.get(emp).size();
            if (currentProjectCount > maximumNumPro) {
                maximumNumPro = currentProjectCount;
                name = emp;
            }
        }
        System.out.println("Employee with Maximum Project is : " + name + " (" + maximumNumPro + ")");


        // Search for a particular project and display all assigned employees. If nobody is assigned, display a suitable message.
        String particularProject = "Banking";
        boolean found = false;
        for (String emp : projects.keySet()) {
            if (projects.get(emp).contains(particularProject)) {
                System.out.println("Employee assigned " + particularProject + " Project is : " + emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No EMployee assigned for this Project...!");
        }


        // Display all unique project names using HashSet and count them.
        HashSet<String> unique = new HashSet<>();
        for (ArrayList<String> emp : projects.values()) {
            unique.addAll(emp);
        }
        System.out.println("Unique Project are : " + unique);


        // Count how many employees are assigned to each project.
        HashMap<String, Integer> projectCount = new HashMap<>();
        for (ArrayList<String> project : projects.values()) {
            for (String pro : project) {
                projectCount.put(pro, projectCount.getOrDefault(pro, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> emp : projectCount.entrySet()) {
            System.out.println(emp.getKey() + " : " + emp.getValue());
        }
    }
}
