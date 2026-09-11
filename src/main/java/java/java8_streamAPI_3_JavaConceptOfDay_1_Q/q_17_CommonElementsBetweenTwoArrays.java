package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.Arrays;
import java.util.List;
/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class q_17_CommonElementsBetweenTwoArrays {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list2.stream().filter(list1::contains).forEach(System.out::println);
    }
}
