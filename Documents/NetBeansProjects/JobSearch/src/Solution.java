
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dotmons
 */
public class Solution {

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
    public Solution(){
        int[][] A = null;
        solution(A);
    }

    public String solution(int[][] A) {
        // write your code in Java SE 8
        System.out.println(getIndexValue(0,0));
        return null;
    }

    private HashMap<Integer, Integer> getIndexValue(int a, int b) {

        HashMap<Integer, Integer> indexValue = new HashMap();

        if ((a < 2) && (b < 2)) {
            indexValue.put(a, b + 1);
            indexValue.put(a + 1, b);
        } else if ((a < 2) && (b > 1)) {
            indexValue.put(a + 1, b);
        } else if ((a > 1) && (b < 2)) {
            indexValue.put(a, b + 1);
        }

        return indexValue;

    }

    public static void main(String[] args){
        new Solution();
    }

}
