/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import Interface.DecimalToBinaryIntr;
import Service.DecimalToBinaryService;

/**
 *
 * @author Dotmons
 */
public class DecimalToBinary {

    DecimalToBinaryIntr decToBin = new DecimalToBinaryService();

    public DecimalToBinary() {
        //System.out.println(assertEquals("100", Integer.parseInt(decToBin.convertToBinary(4))));
        //System.out.println(assertEquals("1010", decToBin.convertToBinary(10)));
        //System.out.println(assertEquals("1100100", decToBin.convertToBinary(100)));
        //System.out.println(assertEquals("11110100001001000000", decToBin.convertToBinary(1000000)));
        // System.out.println(decToBin.convertToBinary(100));
        System.out.println(isPalindrone("Lawal"));
        System.out.println(isPalindrond("Lawal"));
    }

    public boolean isPalindrond(String value) {
        return new StringBuilder(value.toUpperCase()).reverse().toString().equals(value.toUpperCase());
    }

    public boolean isPalindrone(String value) {
        int initValue = value.length();
        if (initValue == 0) {
            return false;
        }

        for (int i = 0; i < initValue / 2; i++) {
            if (value.toUpperCase().charAt(i) != value.toUpperCase().charAt(--initValue)) {
                return false;
            }
        }
        return true;
    }

    public boolean assertEquals(Object bin, Object dec) {
        return (String.valueOf(bin).equals(String.valueOf(dec)));
    }

    public static void main(String[] args) {
        DecimalToBinary bin = new DecimalToBinary();
    }
}
