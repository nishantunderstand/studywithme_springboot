package study.java8_streamAPI_2_Interview_Q;


// Find the Longest String in a List Using Java 8 Streams
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// Wednesday, April 15, 2026 9:01:37 PM
public class a_Paytm_2_LongestStringInList {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple","banana","kiwi","watermelon");
        String res = myList.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(res);
    }
}
