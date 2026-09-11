package java.java8_streamAPI_3_JavaConceptOfDay_1_Q;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class a_1_SeparateOddAndEvenNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        System.out.println("====== Even ======");
        listOfIntegers.stream().filter(n->n%2==0).forEach(System.out::println);


        System.out.println("====== Odd ======");
        listOfIntegers.stream().filter(n->n%2==1).forEach(System.out::println);


        System.out.println("======  Mixed ======");
        listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0)).forEach((k,v) -> System.out.print(k+"->"+v));

        System.out.println("====== Sunday, July 26, 2026 12:30:27 PM ======");
        Map<Boolean,List<Integer>> oddEvenList =  listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println("====== Sunday, July 26, 2026 12:32:53 PM ======\n");
        for(Map.Entry<Boolean, List<Integer>> entry : oddEvenList.entrySet()){
            System.out.println(entry.getKey() + "-> "+ entry.getValue());
        }

    }
}
