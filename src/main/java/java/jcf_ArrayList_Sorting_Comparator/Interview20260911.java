package java.jcf_ArrayList_Sorting_Comparator;

import java.util.*;

/**
 * You need to merge Two Array
 * You need Old Way
 */
class Interview20260911 {
    public static void main(String[] args) {

        int[] arr1 = {25, 23, 7, 66, 35, 41};
        int[] arr2 = {11, 12, 13, 14};

        // 1. Add to List
        List<Integer> al = new ArrayList<>();

        for (int i : arr1) {
            al.add(i);
        }

        for (int i : arr2) {
            al.add(i);
        }

        // 2. Sort using Comparator
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b); // descending
            }
        });

        // 3. Print using Iterator
        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}