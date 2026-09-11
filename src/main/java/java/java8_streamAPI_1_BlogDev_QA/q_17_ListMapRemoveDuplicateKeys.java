package java.java8_streamAPI_1_BlogDev_QA;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
 */
public class q_17_ListMapRemoveDuplicateKeys {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 12));
        noteLst.add(new Notes(3, "note3", 13));
        noteLst.add(new Notes(4, "note4", 14));
        noteLst.add(new Notes(5, "note5", 15));
        noteLst.add(new Notes(6, "note2", 16));  //<--
        // TODO
        Map<String, Long> notesRecord =
                noteLst.stream().sorted(Comparator.comparingLong(Notes::getTagId).reversed())
                        .collect(Collectors.toMap(
                                Notes::getTagName,
                                Notes::getTagId,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new
                        ));

        notesRecord.forEach((k, v) -> System.out.println(k + " = " + v));


    }
}


