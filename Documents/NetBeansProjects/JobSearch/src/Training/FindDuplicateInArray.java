/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dotmons
 */
public class FindDuplicateInArray {

    public FindDuplicateInArray() {
        System.out.println(findDuplicates(new int[]{41, 3, 2, 7, 8, 2, 3, 1}));
    }

    public java.util.List<Integer> findDuplicates(int[] nums) {

        java.util.Arrays.sort(nums);
        java.util.ArrayList<Integer> listVal = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == (nums[i + 1])) {
                listVal.add(nums[i + 1]);
            }
        }
        return listVal;
    }

  

    public static void main(String[] args) {
        FindDuplicateInArray finder = new FindDuplicateInArray();
    }

}
