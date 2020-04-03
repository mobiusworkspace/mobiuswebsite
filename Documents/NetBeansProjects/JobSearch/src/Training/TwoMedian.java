/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;


/**
 *
 * @author Dotmons
 */
public class TwoMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;

        int[] nums = new int[size1 + size2];

        if (size1 > size2) {
            System.arraycopy(nums1, 0, nums, 0, size1);
            for (int i = 0; i < size2; i++) {
                nums[size1++] = nums2[i];
            }

        } else {
            System.arraycopy(nums2, 0, nums, 0, size2);
            for (int i = 0; i < size1; i++) {
                nums[size2++] = nums1[i];
            }
        }
        java.util.Arrays.sort(nums);
        int divideLenght = nums.length / 2;
        if (nums.length % 2 == 0) {
            return ((double)(nums[divideLenght-1] + nums[divideLenght]) / 2);
        } else {
            return (double)(nums[divideLenght]);
        }
    }

    public TwoMedian() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6,7};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static void main(String[] args) {
        new TwoMedian();
    }
}
