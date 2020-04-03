/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dotmons
 */
public class FindMissing {

    public FindMissing() {
        System.out.println(getMissingValue());
    }

    public ArrayList<Integer> getMissingValue() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 12, 9, 5, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 9, 5, 6));

        list1.removeAll(list2);
        return list1;
    }

    public static void main(String[] args) {
        new FindMissing();
    }
}
