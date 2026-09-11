package java.java8_streamAPI_2a_Instagram_Videos_QA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a Java 8 or normal Java program to print combinations that sum to 6.
 * 💻 Input:
 * nums = [2, 4, 3, 3, 5, 7] target = 6
 * 💻 Output:
 * [[2,4], [3,3]]
 *
 * int target = 6;
 */

class EY_PrintCombination_1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2,4,3,3,5,7);
        List<List<Integer>> res = new ArrayList<>();
        int target = 6;
        for(int i=0;i<myList.size();i++){
            for(int j=i+1;j<myList.size();j++){
                if(myList.get(i)+myList.get(j)==target){
                    //res.add(Arrays.asList(myList.get(i), myList.get(j)));
                    /*List<Integer> pair = new ArrayList<>();
                    pair.add(myList.get(i));
                    pair.add(myList.get(j));
                    res.add(pair);
                    */
                    res.add(List.of(myList.get(i),myList.get(j)));

                }
            }
        }
        System.out.println(res);
    }
}