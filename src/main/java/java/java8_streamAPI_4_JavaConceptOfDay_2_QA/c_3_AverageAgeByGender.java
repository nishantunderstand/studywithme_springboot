package java.java8_streamAPI_4_JavaConceptOfDay_2_QA;

import java.util.Map;
import java.util.stream.Collectors;

import static java.java8_streamAPI_4_JavaConceptOfDay_2_QA.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class c_3_AverageAgeByGender {

    public static void main(String[] args) {
        // Group By Gender
        Map<String, Double> averageAgeBygender =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                            Employee::getGender,
                            Collectors.averagingDouble(Employee::getAge)
        ));
        System.out.println(averageAgeBygender);

        System.out.println("====== Saturday, July 25, 2026 5:55:00 PM ======");
        Map<String, Double> averageByDep =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getAge)
                        ));
        System.out.println(averageByDep);
    }
}
