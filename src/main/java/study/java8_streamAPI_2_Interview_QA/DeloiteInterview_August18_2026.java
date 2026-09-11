package study.java8_streamAPI_2_Interview_QA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created : 2026-08-09 12:25:47
 */

/**
 * Merge Two Integer Array
 * Merge Two Integer Array Then Sort it
 * Merge Two Integer Array Then Sort it ASC and DESC
 *
 * What if Array is Primitive Datatype
 */
public class DeloiteInterview_August18_2026 {
    public static void main(String[] args) {
        Integer[] ar1 ={1,4, 2,3,9 };
        Integer[] ar1a ={1,2,3};
        Integer[] ar2 ={11,4,33, 5,6};
        Integer[] ar2a ={4,5,6};



        Integer[] result1 = Stream.concat(Arrays.stream(ar1), Arrays.stream(ar2)).toArray(Integer[]::new);

        Integer[] result2 = Stream.concat(Arrays.stream(ar1), Arrays.stream(ar2))
                .sorted()
                .toArray(Integer[]::new);
        Integer[] result3 = Stream.concat(Arrays.stream(ar1), Arrays.stream(ar2))
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .toArray(Integer[]::new);


        int[] arr1 = {99, 11,22,33,55,900,1,2,24};
        int[] arr2 = {9, 1,2,3,5,0,111,-12,24};

        int[] result4 = IntStream.concat(
                        Arrays.stream(arr1),
                        Arrays.stream(arr2)
                ).sorted()
                .toArray();

        Integer[] result = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                .sorted()
                .toArray(Integer[]::new);


        System.out.println(Arrays.toString(result));
    }

}
