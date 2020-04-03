/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.text.DecimalFormat;

/**
 *
 * @author Dotmons
 */
public class PlusMinus {

    public PlusMinus() {
        int arr[] = {-4, 3, -9, 0, 4, 1};
        //plusMinus(arr);
        System.out.println(timeConversion("06:40:03AM"));
    }

   static String timeConversion(String s) {
        String amclock = "";
        String preclock = s.substring(0, 2).equals("12") ? "12" : String.valueOf(Integer.parseInt(s.substring(0, 2)) + 12);
        if (s.contains("AM") && (s.substring(0, 2).equals("12"))) {
            amclock = "00" + s.substring(2, s.indexOf("AM"));
        } else if (s.contains("AM")){
            amclock = s.substring(0, s.indexOf("AM"));
        }
        return s.contains("AM") ? amclock : preclock + s.substring(2, s.indexOf("PM"));
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int sumPositive = 0;
        int sumNegative = 0;
        int sumZero = 0;

        for (int a : arr) {
            if (a > 0) {
                sumPositive++;
            } else if (a < 0) {
                sumNegative++;
            } else {
                sumZero++;
            }
        }
        System.out.println(getRoundedValue((double) sumPositive / arr.length));
        System.out.println(getRoundedValue((double) sumNegative / arr.length));
        System.out.println(getRoundedValue((double) sumZero / arr.length));
    }

    public static String getRoundedValue(double val) {
        DecimalFormat df = new DecimalFormat("0.0000###");
        return df.format(val);
    }

    public static void main(String[] args) {
        PlusMinus pm = new PlusMinus();
    }
}
