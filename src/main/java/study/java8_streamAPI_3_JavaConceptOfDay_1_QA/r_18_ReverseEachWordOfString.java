package study.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class r_18_ReverseEachWordOfString {

    public static void main(String[] args) {

        String str = "Java Concept Of The Day";
        System.out.println("======  Array Stream Spilit ======\n");
        String res =Arrays.stream(str.split(" "))
                                .map(word -> new StringBuilder(word).reverse().toString())
                                        .collect(Collectors.joining(" "));
        System.out.println("Result : "+ res);

        System.out.println("======  Stream Spilit ======\n");
        String resultNew =  Stream.of(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("resultNew : "+ resultNew);


    }
}
