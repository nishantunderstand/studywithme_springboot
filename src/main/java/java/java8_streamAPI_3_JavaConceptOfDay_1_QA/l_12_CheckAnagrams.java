package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class l_12_CheckAnagrams {

    public static void main(String[] args) {

        String s1 = "RaceCar";
        String s2 = "CarRace";

        boolean isAnagram = s1.length() == s2.length() &&
                Arrays.equals(
                        s1.toLowerCase().chars().sorted().toArray(),
                        s2.toLowerCase().chars().sorted().toArray());

        System.out.println("isAnagram : " + isAnagram);

        System.out.println("======  Build 2 HashMap ======\n");
        Map<Character, Long> smap1 = s1.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map<Character, Long> smap2 = s2.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));


        System.out.println("isAnagram by HashMap : "+ smap1.equals(smap2));
    }
}
