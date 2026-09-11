package study.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class c_3_FrequencyOfEachCharacter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";
        // BuildHashMap and print it
        System.out.println("====== Space is also Printed ======\n");
        inputString.chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));


        System.out.println("====== Sunday, July 26, 2026 12:38:13 PM ======\n");
        System.out.println("====== Space should be Skipped Then Printed ======\n");

        inputString.chars()
                .mapToObj(ch -> (char)ch)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));

        System.out.println("====== Sunday, July 26, 2026 12:39:10 PM ======\n");

        inputString.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch ->ch != ' ')
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).forEach((k,v)-> System.out.println(k+"->"+v));

    }

}
