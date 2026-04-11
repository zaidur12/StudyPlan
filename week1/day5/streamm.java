package week1.day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Dept: " + department + ", Salary: " + salary;
    }
}

public class streamm {

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>(50);

        employee.add(new Employee("Alice", "HR", 30000));
        employee.add(new Employee("Bob", "IT", 50000));
        employee.add(new Employee("Charlie", "Finance", 45000));
        employee.add(new Employee("David", "IT", 52000));
        employee.add(new Employee("Emma", "HR", 31000));
        employee.add(new Employee("Frank", "Finance", 46000));
        employee.add(new Employee("Grace", "IT", 55000));
        employee.add(new Employee("Hannah", "HR", 32000));
        employee.add(new Employee("Ian", "Finance", 47000));
        employee.add(new Employee("Jack", "IT", 53000));
        employee.add(new Employee("Kathy", "HR", 33000));
        employee.add(new Employee("Leo", "Finance", 48000));
        employee.add(new Employee("Mona", "IT", 56000));
        employee.add(new Employee("Nina", "HR", 34000));
        employee.add(new Employee("Oscar", "Finance", 49000));
        employee.add(new Employee("Paul", "IT", 57000));
        employee.add(new Employee("Queen", "HR", 35000));
        employee.add(new Employee("Ryan", "Finance", 50000));
        employee.add(new Employee("Sophia", "IT", 58000));
        employee.add(new Employee("Tom", "HR", 36000));
        employee.add(new Employee("Uma", "Finance", 51000));
        employee.add(new Employee("Victor", "IT", 59000));
        employee.add(new Employee("Wendy", "HR", 37000));
        employee.add(new Employee("Xavier", "Finance", 52000));
        employee.add(new Employee("Yara", "IT", 60000));
        employee.add(new Employee("Zane", "HR", 38000));
        employee.add(new Employee("Aarav", "Finance", 53000));
        employee.add(new Employee("Isha", "IT", 61000));
        employee.add(new Employee("Rohan", "HR", 39000));
        employee.add(new Employee("Neha", "Finance", 54000));
        employee.add(new Employee("Karan", "IT", 62000));
        employee.add(new Employee("Priya", "HR", 40000));
        employee.add(new Employee("Ankit", "Finance", 55000));
        employee.add(new Employee("Meera", "IT", 63000));
        employee.add(new Employee("Rahul", "HR", 41000));
        employee.add(new Employee("Simran", "Finance", 56000));
        employee.add(new Employee("Vikas", "IT", 64000));
        employee.add(new Employee("Pooja", "HR", 42000));
        employee.add(new Employee("Arjun", "Finance", 57000));
        employee.add(new Employee("Sneha", "IT", 65000));
        employee.add(new Employee("Deepak", "HR", 43000));
        employee.add(new Employee("Kriti", "Finance", 58000));
        employee.add(new Employee("Manish", "IT", 66000));
        employee.add(new Employee("Ritika", "HR", 44000));
        employee.add(new Employee("Suresh", "Finance", 59000));
        employee.add(new Employee("Amit", "IT", 67000));
        employee.add(new Employee("Divya", "HR", 45000));
        employee.add(new Employee("Harsh", "Finance", 60000));
        employee.add(new Employee("Tanvi", "IT", 68000));
        employee.add(new Employee("Nikhil", "HR", 46000));

        // You can keep adding up to 50 or more

        // List<Employee> salaryy = employee.stream().filter(x-> x.getSalary() >
        // 25000).collect(Collectors.toList());
        // System.out.println(salaryy);
        List<Employee> topem = employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3)
                .collect(Collectors.toList());
        System.out.println(topem);
        double avgSalary = employee.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        Map<String, List<Employee>> grouped = employee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(grouped);

        System.out.println(avgSalary);

    }
}
