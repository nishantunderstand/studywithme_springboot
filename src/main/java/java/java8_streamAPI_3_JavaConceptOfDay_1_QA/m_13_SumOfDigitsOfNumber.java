package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class m_13_SumOfDigitsOfNumber {

    public static void main(String[] args) {
        int i = 15623;
        int sum  = String.valueOf(i)
                .chars()
                .map(c -> c-'0')
                .sum();
        System.out.println("Sum : "+ sum);


        int sum1 = String.valueOf(i)
                .chars()
                .mapToObj(c -> c-'0')
                .reduce(0,Integer::sum);
        System.out.println("Sum By reduce : IDK " + sum1);

        System.out.println("====== ParseInt Approach ======\n");
        System.out.println("====== Sunday, July 26, 2026 3:51:19 PM ======\n");

        int sum3 = Stream.of(String.valueOf(i).split(""))
                        .collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("Sum3 : "+ sum3);
    }
}
