package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class v_22_MostRepeatedElementInArray {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        listOfStrings.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Element : "+ entry.getKey() + " Value : " + entry.getValue()));
        System.out.println("====== Saturday, July 25, 2026 3:15:23 PM ======");

        listOfStrings.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max((e1,e2)-> e1.getValue().compareTo(e2.getValue()))
                .ifPresent(entry -> System.out.println("Most Frequent Element : "+entry.getKey() + "\t Occurence : "+ entry.getValue()));
        System.out.println("====== Saturday, July 25, 2026 3:19:41 PM ======");




    }
}
