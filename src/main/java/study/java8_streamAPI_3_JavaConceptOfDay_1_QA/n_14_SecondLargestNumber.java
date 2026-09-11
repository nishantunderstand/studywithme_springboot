package study.java8_streamAPI_3_JavaConceptOfDay_1_QA;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class n_14_SecondLargestNumber {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        // listOfIntegers.stream().max(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println); WRONG
        System.out.println("====== Sorted In Reverse then Find First  ======\n");
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("====== Ascending Sort + Skip ======\n");

        listOfIntegers.stream()
                .sorted()
                .skip(listOfIntegers.size()-2)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("====== LIMIT  ======\n");
        listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
