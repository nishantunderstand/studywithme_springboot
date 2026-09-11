package study.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.Arrays;
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

}
