package study.java8_streamAPI_3_JavaConceptOfDay_1_QA;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class k_11_ThreeMaxAndThreeMinNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        // listOfIntegers.stream().max(Integer::compare).limit(3).forEach(System.out::println); // WRONG
        // listOfIntegers.stream().max(Integer::compare).limit(3).ifPresent(System.out::println); // WRONG

        System.out.println("====== Comparator Approach Max ======\n");
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("====== Comparator Ascending Order  ======\n");
        listOfIntegers.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);



    }
}
