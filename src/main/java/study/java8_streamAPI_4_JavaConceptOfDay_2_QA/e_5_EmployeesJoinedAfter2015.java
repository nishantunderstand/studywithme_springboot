package study.java8_streamAPI_4_JavaConceptOfDay_2_QA;

import static study.java8_streamAPI_4_JavaConceptOfDay_2_QA.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class e_5_EmployeesJoinedAfter2015 {

    public static void main(String[] args) {
        System.out.println("====== Saturday, July 25, 2026 6:31:55 PM ======");
        // Print Full Details
        employeeList.stream()
                .filter(emp -> emp.getYearOfJoining()>2015)
                .forEach(System.out::println);

        System.out.println("====== Saturday, July 25, 2026 6:32:05 PM ======");
        // Print Name
        employeeList.stream()
                .filter(emp -> emp.getYearOfJoining()>2015)
                .map(Employee::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
