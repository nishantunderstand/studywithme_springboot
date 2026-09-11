package study.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://www.instagram.com/reel/DXA-FY8DIEe/
public class SecondHighestSalaryEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Neha", 70000),
                new Employee(3, "Raj", 60000),
                new Employee(4, "Simran", 90000),
                new Employee(5, "Karan", 80000)
        );

        // You worked Only on Salary
        Integer resSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(resSalary);

        Employee res = employees.stream()
                .distinct()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(res);
    }
}

class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id
                + ", name='" + name + '\''
                + ", salary=" + salary + '}';
    }
}
