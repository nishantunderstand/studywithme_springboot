package study.java8_streamAPI_4_JavaConceptOfDay_2_QA;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static study.java8_streamAPI_4_JavaConceptOfDay_2_QA.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class a_1_CountMaleAndFemaleEmployees {

    public static void main(String[] args) {
        long male = employeeList.stream().filter(emp -> emp.getGender().equals("Male")).count();
        System.out.println("Male  : "+male);


        long female = employeeList.stream().filter(emp -> emp.getGender().equals("Female")).count();
        System.out.println("female  : "+female);

        System.out.println("====== Saturday, July 25, 2026 4:23:01 PM ======");

        Map<Employee, Long> noOfMaleAndFemale = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(noOfMaleAndFemale);
    }
}
