package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.List;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class x_24_StringsStartWithNumber {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream()
                .filter(s -> s.startsWith("2")) // I need to pass regex or something else
                .forEach(System.out::println);
        System.out.println("====== Saturday, July 25, 2026 8:45:09 PM ======");

        listOfStrings.stream()
                .filter(s-> s.matches("^\\d.*"))
                .forEach(System.out::println);
        System.out.println("====== Saturday, July 25, 2026 8:46:17 PM ======");


        // Hint : First Character is Number , We Can use this as Hint
        listOfStrings.stream()
                .filter(s -> Character.isDigit(s.charAt(0)))
                .forEach(System.out::println);

        System.out.println("====== Saturday, July 25, 2026 8:47:37 PM ======");

        // Why I have Solved it 3-Times, Because I will only remember this one.
        listOfStrings.stream()
                .filter(s -> s.charAt(0)>='0' && s.charAt(0)<='9')
                .forEach(System.out::println);




    }
}
