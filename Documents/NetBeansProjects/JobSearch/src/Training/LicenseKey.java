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
public class LicenseKey {

    public String licenseKeyFormatting(String S, int K) {

        int StringSize = S.length();
        int firstDashSize = S.indexOf("-");
        String finalValue = S.substring(0, firstDashSize + 1);
        String adder = "";
        for (int i = firstDashSize + 1; i < StringSize; i++) {

            if ((!(S.substring(i, i + 1).equals("-")))) {
                adder += S.substring(i, i + 1);
                if ((adder.length() == K)) {

                    finalValue = finalValue + adder + "-";
                    adder = "";
                }

                System.out.println(adder);
            }
        }

        if (finalValue.subSequence(finalValue.length() - 1, finalValue.length()).equals("-")) {
            return finalValue.substring(0, finalValue.length() - 1);
        }
        return finalValue;
    }

    public LicenseKey() {
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }

    public static void main(String[] args) {
        new LicenseKey();
    }
}
