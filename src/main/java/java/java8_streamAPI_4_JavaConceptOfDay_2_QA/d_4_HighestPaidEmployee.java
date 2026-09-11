package java.java8_streamAPI_4_JavaConceptOfDay_2_QA;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.java8_streamAPI_4_JavaConceptOfDay_2_QA.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class d_4_HighestPaidEmployee {

    public static void main(String[] args) {
        // Global Max
        employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);
        System.out.println("====== Saturday, July 25, 2026 6:00:32 PM ======");

        // Based On Gender Determine Max
        // Stream -> Collect -> Seperate Based on Gender -> Then apply this max Logic
        // Where to save this data ? What it will return ? IDK


        employeeList.stream().collect(
                Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                )
        ).forEach((k,v)-> System.out.println(k + "->"+v));

        System.out.println("====== Saturday, July 25, 2026 6:06:21 PM ======");

        

    }
}
