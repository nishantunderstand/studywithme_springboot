package java.java8_streamAPI_3_JavaConceptOfDay_1_QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @see <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">
 *     Java 8 Interview Sample Coding Questions </a>
 */
public class h_8_MaxAndMinOfIntegers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("====== Sunday, July 26, 2026 1:24:25 PM ======\n");
        System.out.println("====== By Natural Order  ======\n");
        int max =  listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int min =  listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max : "+ max + "\t Min : "+ min);


        System.out.println("====== By Reverse Order, You need to reverse it max will be min, min will be max  ======\n");

        int min1 =  listOfIntegers.stream().max(Comparator.reverseOrder()).get();
        int max1=  listOfIntegers.stream().min(Comparator.reverseOrder()).get();
        System.out.println("Max : "+ max1 + "\t Min : "+ min1);



        System.out.println("====== By Comparator ======\n");

        int max2 =  listOfIntegers.stream().max(Integer::compare).get();
        int min2 =  listOfIntegers.stream().min(Integer::compare).get();
        System.out.println("Max : "+ max2 + "\t Min : "+ min2);



    }
}
