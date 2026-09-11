package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class z_26_PrintDuplicateCharacters {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        // Use HashSet

        Set<Character> seen = new HashSet<>();
        System.out.println("====== It will print space as welll ======");
        inputString.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .filter(ch -> !seen.add(ch))
                .forEach(System.out::println);



        Set<Character> seenNew = new HashSet<>();
        System.out.println("======  Better Approach======");
        inputString.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .filter(Character::isLetter)
                .filter(s -> !seenNew.add(s))
                .distinct()
                .forEach(System.out::println);


        Set<Character> seenNew2 = new HashSet<>();
        System.out.println("======  Super Better  Approach======");
        inputString.chars()
                .mapToObj(ch -> Character.toLowerCase((char)ch))
                .filter(ch -> ch>='a' && ch<='z')
                .filter(s -> !seenNew2.add(s))
                .distinct()
                .forEach(System.out::println);


    }
}
