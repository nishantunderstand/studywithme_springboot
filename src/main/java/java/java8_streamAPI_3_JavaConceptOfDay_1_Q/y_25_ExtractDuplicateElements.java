package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>

 */
public class y_25_ExtractDuplicateElements {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> seen = new HashSet<>();

        System.out.println("====== Duplicate Element ======");
        listOfIntegers.stream().filter(s -> !seen.add(s)).forEach(System.out::println);

        System.out.println("====== Distinct Element ======");
        listOfIntegers.stream().distinct().forEach(System.out::println);
    }
}
