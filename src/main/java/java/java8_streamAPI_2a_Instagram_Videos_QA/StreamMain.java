package java.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.List;

/**
 * Sunday, May 25, 2025 11:51:25 AM
 *
 * Stream API in Java 8+
 * -----------------------
 * Types of Stream Operations:
 *
 * 1. Intermediate Operations:
 *    - These are lazy operations.
 *    - They return a new Stream.
 *    - The actual processing happens only when a terminal operation is invoked.
 *    - Examples:
 *      - filter(Predicate)
 *      - map(Function)
 *      - sorted()
 *      - distinct()
 *      - limit(long)
 *      - skip(long)
 *
 * 2. Terminal Operations:
 *    - These trigger the actual processing of the stream.
 *    - They return a result (non-stream) or perform an action (e.g., void).
 *    - Examples:
 *      - forEach(Consumer)         // returns void
 *      - collect(Collector)        // returns List, Set, Map, etc.
 *      - reduce(BinaryOperator)    // returns Optional or a value
 *      - count()                   // returns long
 *      - anyMatch(), allMatch()    // return boolean
 *      - findFirst(), findAny()    // return Optional<T>
 *
 * Note:
 * - A stream pipeline should end with a terminal operation.
 * - Intermediate operations are chained and evaluated lazily.
 */


public class StreamMain {
	public static void main(String[] args) {
		// How to declare Stream

		List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		list1.stream().forEach(e->{
			System.out.println("Current : "+e);
		});
	}
}
