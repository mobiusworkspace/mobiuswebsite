/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionJava;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dotmons
 */
public class SetHashSet {

    // TreeSet always return a sorted list by default
    public SetHashSet() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);

        numbers.forEach(num -> System.out.println(num));

    }

    public static void main(String[] args) {
        SetHashSet setHashSet = new SetHashSet();
    }
}
