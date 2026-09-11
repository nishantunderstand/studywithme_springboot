package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class e_5_SortDecimalsInReverseOrder {

    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        System.out.println("====== Ascending Order ======\n");
        decimalList.stream()
                .sorted()
                .forEach(System.out::println);



        System.out.println("====== Decending  Order ======\n");
        decimalList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);


        System.out.println("====== Decending  Order ======\n");
        System.out.println("====== Sunday, July 26, 2026 1:13:03 PM ======\n");
        decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        System.out.println("====== By Comparing Value Decending  Order ======\n");
        System.out.println("====== Sunday, July 26, 2026 1:14:51 PM ======\n");
        decimalList.stream()
                .sorted(Comparator.comparingDouble(Double::doubleValue).reversed())
                .forEach(System.out::println);



        System.out.println("====== By Comparing Other One  Value Decending  Order ======\n");
        System.out.println("====== Sunday, July 26, 2026 1:16:03 PM ======\n");
        decimalList.stream()
                .sorted(Comparator.comparingDouble(d-> (double) d).reversed())
                .forEach(System.out::println);



    }
}
