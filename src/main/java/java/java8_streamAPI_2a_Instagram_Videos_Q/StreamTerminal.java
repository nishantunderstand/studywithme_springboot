package java.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.Arrays;
import java.util.List;

/**
 * Jun 2, 2025 , 10:13:59 PM
  Streams in Java are lazy ?
  meaning they only execute their intermediate operations (filter, map, etc.) when a terminal operation is invoked.
  Intermediate operations (like filter, map, sorted) are only setup steps.
  Terminal operations (like forEach, collect, count, anyMatch, etc.) trigger actual processing.
 *
 */


public class StreamTerminal {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
	}
}
