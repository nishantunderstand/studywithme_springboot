package study.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class t_20_ReverseIntegerArray {

    public static void main(String[] args) {

        // Fix: Convert IntStream to Stream<Integer> using boxed()
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        Arrays.stream(array)
                .boxed() //<--
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
