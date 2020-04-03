/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeDepot;

/**
 *
 * @author Dotmons
 */
public class FindMaxDiffInAnArray {

    public static void main(String[] args) {
        int[] array = {14, 2, 3, 44, 5, 6, 9, 12, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        int[] pairWithMaxDiff = findPairWithMaxDiff(array);
        
        for (int n : pairWithMaxDiff){
            System.out.println("N value >>> " + n);
        }
        System.out.printf("Max diff is %d found between elements %d and %d", pairWithMaxDiff[1]
                - pairWithMaxDiff[0], pairWithMaxDiff[0], pairWithMaxDiff[1]);
    }

    private static int[] findPairWithMaxDiff(int[] array) {
        int diff = 0;
        int pairWithMaxDiff[] = new int[2];
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j] && (array[j] - array[i]) > diff) {
                    diff = array[j] - array[i];
                    pairWithMaxDiff[0] = array[i];
                    pairWithMaxDiff[1] = array[j];
                }
            }
        }
        return pairWithMaxDiff;
    }
}
