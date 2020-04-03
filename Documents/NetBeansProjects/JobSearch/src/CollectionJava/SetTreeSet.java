/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionJava;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dotmons
 */
public class SetTreeSet {

    public SetTreeSet() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);

        numbers.forEach(num -> System.out.println(num));
        
    }

    public static void main(String[] args) {
        SetTreeSet setTreeSet = new SetTreeSet();
    }
}
