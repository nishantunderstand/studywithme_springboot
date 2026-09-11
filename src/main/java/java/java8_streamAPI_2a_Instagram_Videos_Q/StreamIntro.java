package java.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(22);
		list2.add(32);
		list2.add(42);

		List<Integer> list3 = Arrays.asList(23,567,12,677,24); // UnModifable List

		// Stream Approach 1

		// Stream Approach 2;

		// Stream Approach 3 Printing
		// Printing Each One

		// Printing All at Once

	}
}
