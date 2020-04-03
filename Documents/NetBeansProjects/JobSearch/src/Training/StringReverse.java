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
public class StringReverse {

    public StringReverse() {

        System.out.println(assertEqual(reverseString("shopify"), "yfipohs"));
    }

    public boolean assertEqual(String object, String value) {
        return object.equals(value);

    }

    public String reverseString(String input) {

        StringBuilder sBuilder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            sBuilder.append(input.charAt(i));
        }
        return sBuilder.toString();

    }

    public static void main(String[] args) {
        new StringReverse();
    }
}
