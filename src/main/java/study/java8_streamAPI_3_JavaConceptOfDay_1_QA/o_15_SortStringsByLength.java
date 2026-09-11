package study.java8_streamAPI_3_JavaConceptOfDay_1_QA;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class o_15_SortStringsByLength {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        System.out.println("====== Length : Ascending Order ======\n");
        listOfStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);


        System.out.println("====== Length : Descending Order ======\n");
        listOfStrings.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
