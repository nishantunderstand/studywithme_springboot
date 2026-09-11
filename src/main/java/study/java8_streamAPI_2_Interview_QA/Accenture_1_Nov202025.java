package study.java8_streamAPI_2_Interview_QA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Nov 20,2025
 */
public class Accenture_1_Nov202025 {
  public static void main(String[] args) {

    List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,1);

    Map<Integer,Integer> freqMap = new HashMap<>();
    for(int i=0;i<myList.size();i++){
      int key = myList.get(i);
      freqMap.put(key,freqMap.getOrDefault(key,0)+1);
    }

    System.out.println("Key"+ " : "+" Value");
    for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
      // System.out.println(entry.getKey() + " : " + entry.getValue());
      System.out.println(entry);
    }


  }
}

/**
 * Tell me About HashMap Method
 */