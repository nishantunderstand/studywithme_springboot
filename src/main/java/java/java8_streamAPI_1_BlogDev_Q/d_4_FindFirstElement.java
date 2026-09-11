package java.java8_streamAPI_1_BlogDev_Q;

import java.util.Arrays;
import java.util.List;

/**
 * Tuesday, May 27, 2025 6:24:56 PM
 * 4. Given the list of integers, find the
 * first element of the list using Stream functions?
 * ?? It works on Stirng as well Integer ? Does it have any Constraint ?
 */

public class d_4_FindFirstElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        // TODO : Can we use forEach on Optional ?
        // Java 8 : Not allowed
        // Java 9 : Allowed you can apply stream twice ?
        // TODO : Is it violiating Stream resuse one ?

        // myList.stream().findFirst().forEach(System.out::println);  //<-- Will Not WORK
        System.out.println("===== if Present ========");
        myList.stream().findFirst().ifPresent(System.out::println);

        System.out.println("====== Monday, August 17, 2026 8:18:53 PM ======\n");
        myList.stream()
                .findFirst()
                .stream()
                .forEach(System.out::println);


        System.out.println("===== get ========");
        Integer res = myList.stream().findFirst().get();
        System.out.println(res);

        System.out.println("===== Direct Approach ========");

        // We can Apply Stream Again on Optional From Java 9 Onward
        // Direct Sol
        System.out.println(myList.get(0));

        System.out.println("====== Saturday, January 10, 2026 6:47:53 PM ======");
        System.out.println("====== Java 9 Approach ======");
        myList.stream()
                .findFirst()
                .stream()
                .forEach(System.out::println);

        System.out.println("====== Java 9 IfPresentOrElse  ======");
        System.out.println("====== Wednesday, April 15, 2026 12:26:39 AM ======");

        myList.stream()
                .findFirst()
                .ifPresentOrElse(
                        value -> System.out.println("Value Found " + value),
                        () -> System.out.println("No Value Found")
                );

    }
}

