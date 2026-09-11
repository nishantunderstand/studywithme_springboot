package study.java8_streamAPI_4_JavaConceptOfDay_2_QA;

import java.util.Map;
import java.util.stream.Collectors;

import static study.java8_streamAPI_4_JavaConceptOfDay_2_QA.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class f_6_CountEmployeesByDepartment {

    public static void main(String[] args) {

        employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ))
                .forEach((k,v)-> System.out.println(k + "-> "+v));

        System.out.println("====== Saturday, July 25, 2026 6:36:48 PM ======");

        Map<String, Long> empDepList =  employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        for(Map.Entry<String,Long> entry : empDepList.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
