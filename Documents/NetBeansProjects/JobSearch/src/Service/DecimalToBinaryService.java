/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Interface.DecimalToBinaryIntr;

/**
 *
 * @author Dotmons
 */
public class DecimalToBinaryService implements DecimalToBinaryIntr {

    @Override
    public String convertToBinary(int dec) {
        String count = "";
        while (dec > 1) {
            count += dec % 2 == 0 ? "0" : "1";
            dec = dec / 2;
        }
        return ("1"+ new StringBuilder(count).reverse());
    }

}
