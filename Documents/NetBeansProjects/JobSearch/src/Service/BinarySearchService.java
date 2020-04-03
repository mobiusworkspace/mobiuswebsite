/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Interface.BinarySearchIntr;
import java.util.ArrayList;

/**
 *
 * @author Dotmons
 */
public class BinarySearchService implements BinarySearchIntr {

    @Override
    public int binarySearch(ArrayList<Integer> myList, int target) {
        int first = 0;
        int last = myList.size() - 1;
        int midpoint = 0;

        while (first <= last) {
            midpoint = (first + last) / 2;
            if (myList.get(midpoint) == target) {
                return myList.get(midpoint);
            } else if (target < myList.get(midpoint)) {
                last = midpoint - 1;
            } else {
                first = midpoint + 1;
            }
        }
        return 0;
    }

    @Override
    public int binaryDOtunSearch(ArrayList<Integer> myList, int target) {
        // list [2,5,9,13,19,21]
        java.util.Collections.sort(myList);
        int first = 0;
        int last = myList.size() - 1;
        int midpoint = 0;

        while (first <= last) {

            midpoint = (first + last) / 2;
            if (target == myList.get(midpoint)) {
                return myList.get(midpoint);
            } else if (target > myList.get(midpoint)) {
                first = midpoint + 1;
            } else {
                last = midpoint - 1;
            }
        }
        return 0;
    }

}
