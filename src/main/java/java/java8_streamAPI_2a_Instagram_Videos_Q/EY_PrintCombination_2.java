package java.java8_streamAPI_2a_Instagram_Videos_Q;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a Java 8 or normal Java program to print combinations that sum to 6. 💻
 * Input: nums = [2, 4, 3, 3, 5, 7] target = 6 💻 Output: [[2,4], [3,3]] int
 * target = 6;
 */
class EY_PrintCombination_2 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2, 4, 3, 3, 5, 7);
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> result
                = myList.stream()
                        .filter(num -> {
                            int complement = 6 - num;
                            if (seen.contains(complement)) {
                                return true;
                            }
                            seen.add(num);
                            return false;
                        })
                        .map(num -> List.of(num, 6 - num))
                        .distinct()
                        .toList();

        System.out.println(result);
    }
}
