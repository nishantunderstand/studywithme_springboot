package study.jcf_ArrayList_Sorting_Comparator;

import java.util.*;

public class ArrayListSorting {
    public static void main(String[] args) {
        List<Integer> al = List.of(11, 99, 88, 22, 33, 44);
        List<Integer> al2 = List.of(99, 33, 11, 55, 88, 44, 22, 33);
        List<Integer> al3 = new ArrayList<>();

        al.add(99);
        al.add(11);
        al.add(22);
        al.add(44);
        al.add(55);


        //List.sort(al); // Not-Valid
        al.sort(Comparator.naturalOrder()); // Behaviour with Mutable / Immutable List
        al.sort(Comparator.reverseOrder());
        System.out.println(al);

        al.stream().forEach(System.out::println);
        al.stream().sorted().forEach(System.out::println);

        //al.stream().sorted(Comparator.reverse()).forEach(System.out::println); // Not-Valid
        //al.stream().sorted(Comparator.reversed()).forEach(System.out::println); // Not-Valid

        al.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //al.stream().sorted(Collections.naturalOrder()).forEach(System.out::println); // Not-Valid

        al.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        //al.stream().reversed().forEach(System.out::println); // Not Valid

        al.reversed().forEach(System.out::println); // Java-21

        Collections.sort(al); // Behaviour with Mutable / Immutable List

        //Collections.sort(al, reversed()); // Invalid

        Collections.sort(al, Comparator.reverseOrder()); // Behaviour with Mutable / Immutable List
        Collections.sort(al, Collections.reverseOrder()); // Behaviour with Mutable / Immutable List

        System.out.println(al);


        Collections.sort(al, (a, b) -> a - b);
        Collections.sort(al, Integer::compare);
        Collections.sort(al, (a, b) -> Integer.compare(a, b));
    }
}