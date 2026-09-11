package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class w_23a_PalindromeProgram {

    public static void main(String[] args) {

        String str = "ROTATOR";

        String reversed = IntStream.range(0,str.length())
                .mapToObj(i -> String.valueOf(str.charAt(str.length()-1-i)))//<--
                .collect(Collectors.joining(""));
        System.out.println("====== Saturday, July 25, 2026 8:35:09 PM ======");
        System.out.println("isPalindrome : "+  str==reversed);
        System.out.println("isPalindrome : "+  str.equals(reversed));

    }
}
