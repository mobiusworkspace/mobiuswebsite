/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import org.junit.Test;

/**
 *
 * @author Dotmons
 */
public class StringComparison {

    public StringComparison() {
        System.out.println(compareString("Àad", "Aad"));
    }

    public boolean compareString(String firstVal, String secondVal) {

        if (firstVal.length() != secondVal.length()) {
            return false;
        }

        for (int i = 0; i < firstVal.length(); i++) {
            if ((int) firstVal.charAt(i) != (int) secondVal.charAt(i)) {
                System.out.println("ASCII >> " + (int) firstVal.charAt(i));
                return false;
            } else {
                System.out.println("ASCII >> " + (int) firstVal.charAt(i));
            }
        }

        return true;
    }
    
    boolean isAInB(String firstVal, String secondVal){
        char initChar = secondVal.charAt(0);
        int number = 0;
        
        for (int i=0; i<secondVal.length(); i++){
            if (firstVal.charAt(i)==initChar){
                initChar = secondVal.charAt(number++);
            }
        }
        return false;
    }

    
    
    public static void main(String[] args) {
        StringComparison ss = new StringComparison();
    }
}
