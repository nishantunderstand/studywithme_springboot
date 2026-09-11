package java.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Sunday, May 25, 2025 11:08:50 AM
 *
 * List
 *
 * Types of List :
 *
 * Types of List (Based on Mutablity) :
 *
 * 1. Immutable
 * List.of
 * Arrays.asList
 *
 * 2. Mutable
 * new ArrayList<>()
 *
 *
 * method reference Vs Lambda Operator
 *
 * Stream : Interface
 *
 */

public class StreamIntro {
	public static void main(String[] args) {
		// How to Declare List ?
		List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67); // UnModifiable List
		// list1.add(20); // java.lang.UnsupportedOperationException
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(22);
		list2.add(32);
		list2.add(42);
		System.out.println(list2); // Modifable List

		List<Integer> list3 = Arrays.asList(23,567,12,677,24); // UnModifable List
		System.out.println(list3);


		// Stream Approach 1
		Stream<Integer> stream = list1.stream();
		List<Integer> evenList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even Number By Stream :"+evenList);

		// Stream Approach 2;
		List<Integer> result = list1.stream().filter(i->i%2 ==0).collect(Collectors.toList());
		System.out.println("Result in Single Line "+result);

		// Stream Approach 3 Printing
		System.out.println("Printing Each One");
		list1.stream().filter(i->i%2==0).forEach(i->System.out.println("Even Number "+i));  //<--

		System.out.println("Printing All at Once");
		list1.stream().filter(i->i%2==0).forEach(System.out::println);  //<-- method reference


	}
}
