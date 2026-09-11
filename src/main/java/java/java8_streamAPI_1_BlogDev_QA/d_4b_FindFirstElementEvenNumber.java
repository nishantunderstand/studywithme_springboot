package java.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.List;


public class d_4b_FindFirstElementEvenNumber {
    public static void main(String[] args) {
        System.out.println("======  Find First Even Number  ======");
        List<Integer> myList = Arrays.asList(1, 3, 5, 7);
        Integer res = myList.stream()
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(-1);

        System.out.println(res);
    }
}


