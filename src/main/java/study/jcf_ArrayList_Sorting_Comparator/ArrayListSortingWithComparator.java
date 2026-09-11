package study.jcf_ArrayList_Sorting_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortingWithComparator {
    public static void main(String[] args) {
        List<Integer> al1 = List.of(11, 99, 88, 22, 33, 44);
        List<Integer> al2 = List.of(99, 33, 11, 55, 88, 44, 22, 33);

        List<Integer> al = new ArrayList<>();
        al.add(99);
        al.add(11);
        al.add(22);
        al.add(44);
        al.add(55);

        // You need to pratice it
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        });

        System.out.println(al);

    }
}