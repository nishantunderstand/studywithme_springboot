package study.java8_streamAPI_2_Interview_QA;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created : 2026-08-09 12:25:47
 */


public class DeloiteInterview_August18_2026 {
    public static void main(String[] args) {
        Integer[] ar1 ={1,2,3};
        Integer[] ar2 ={4,5,6};
        Integer[] result = Stream.concat(Arrays.stream(ar1),Arrays.stream(ar2)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}