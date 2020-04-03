/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.util.Arrays;

/**
 *
 * @author Dotmons
 */
public class RemoveNameDuplicates {

    public RemoveNameDuplicates() {
        String[] name1 = {"Dotun", "Yemi", "Ade"};
        String[] name2 = {"Sule", "Dotun", "Dotun", "Yemi", "Ade"};

        int size1 = name1.length;
        int size2 = name2.length;

        String[] nums = new String[size1 + size2];

        if (size1 > size2) {
            System.arraycopy(name1, 0, nums, 0, size1);
            for (int i = 0; i < size2; i++) {
                nums[size1++] = name2[i];
            }
        } else {
            System.arraycopy(name2, 0, nums, 0, size2);
            for (int i = 0; i < size1; i++) {
                nums[size2++] = name1[i];
            }
        }
        java.util.Arrays.sort(nums);
        java.util.ArrayList<String> listVal = new java.util.ArrayList<>();
        listVal.add(nums[0]);
        for (int i = 0; i < nums.length - 1; i++) {
            if (!(nums[i].equals(nums[i + 1]))) {
                listVal.add(nums[i+1]);
            }
        }

        listVal.stream().forEach((ans) -> {
             System.out.println(ans);
        });

    }

    public static void main(String[] args) {
        RemoveNameDuplicates removeNameDuplicates = new RemoveNameDuplicates();
    }
}
