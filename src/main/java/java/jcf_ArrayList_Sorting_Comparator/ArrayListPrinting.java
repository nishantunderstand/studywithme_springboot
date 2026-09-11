package java.jcf_ArrayList_Sorting_Comparator;

import java.util.*;
/**
 * Refer to Notes.md for detailed notes
 */
public class ArrayListPrinting {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = List.of(11, 99, 88, 22, 33, 44);
        List<Integer> al = Arrays.asList(99,11,14,18,19);

        // System.out.println(Arrays.toString(al)); // WRONG

        System.out.println(al);

        // 1. Enhanced for-loop
        for (Integer i : al) {
            System.out.println(i);
        }

        // 2. Iterator
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 3. Stream
        al.stream().forEach(System.out::println);
    }
}