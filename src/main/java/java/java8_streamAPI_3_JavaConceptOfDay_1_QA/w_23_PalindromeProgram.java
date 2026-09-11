package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.stream.IntStream;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class w_23_PalindromeProgram {

    public static void main(String[] args) {

        String str = "ROTATOR";

        // Palindrom : Forward and Reverse Identical
        boolean isPalindrome = IntStream.range(0,str.length()/2)
                .allMatch(i-> str.charAt(i) == str.charAt(str.length()-1-i));

        System.out.println("isPalindrome : " + isPalindrome);
    }
}
