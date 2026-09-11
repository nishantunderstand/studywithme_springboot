package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class g_7_MultiplesOfFive {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream()
                .filter(n-> n%5==0)
                .forEach(System.out::println);

    }
}
