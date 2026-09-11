package java.java8_streamAPI_2_Interview_QA;

import java.util.*;
// Wednesday, April 15, 2026 9:01:37 PM
public class a_Paytm_2 {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple","banana","kiwi","watermelon");
        String res = myList.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("res : "+res);

    }
}
