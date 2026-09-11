package java.java8_streamAPI_4_JavaConceptOfDay_2_QA;

import static java.java8_streamAPI_4_JavaConceptOfDay_2_QA.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class b_2_ListAllDepartments {

    public static void main(String[] args) {
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }
}
