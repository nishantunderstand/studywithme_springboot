package java.java8_streamAPI_1_BlogDev_QA;

import java.util.Arrays;
import java.util.List;

/**
 * Tuesday, May 27, 2025 6:35:05 PM
 * 5. Given a list of integers, find the total number of elements present in the list using Stream functions?
 */

public class e_5_FindTheTotalNumberOfElements_IMP {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("===== Direct Approach ====");
        System.out.println(myList.size());

        System.out.println("===== Stream Approach ====");
        Long cnt = myList.stream().count(); //<-- Is it UpperCase or LowerCase ???
        System.out.println(cnt);

        System.out.println("===== Array Approach ====");
        int[] arr = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        Long cnt1 = Arrays.stream(arr).boxed().count();
        System.out.println(cnt1);
        System.out.println("====== Saturday, January 10, 2026 7:15:58 PM ======");
        int res1 = Math.toIntExact(myList.stream().count());
        System.out.println(res1);

    }
}


