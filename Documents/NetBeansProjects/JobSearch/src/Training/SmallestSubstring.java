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
public class SmallestSubstring {

    public SmallestSubstring() {
        char arr[] = {'y', 'y', 'z', 'z'};
        String str = "xyyzyzyx";
        //System.out.println(getShortestUniqueSubstring(arr, str));

        String words[] = {"but", "put", "big", "pot", "pog", "dog", "lot"};
        System.out.println(shortestWordEditPath("bit", "dog", words));

    }

    String getShortestUniqueSubstring(char[] arr, String str) {

        int charSum = 0;
        int tCount = 0;
        int pCount = 0;
        char[] strchar = str.toCharArray();

        for (char a : arr) {
            charSum += (int) a;
            pCount += (int) strchar[tCount++];
        }
        if (charSum == pCount) {
            return str.substring(0, arr.length);
        } else {

            for (int i = arr.length; i < str.length(); i++) {
                pCount = pCount - ((int) strchar[i - arr.length]) + ((int) strchar[i]);

                if (charSum == pCount) {
                    return str.substring(i - arr.length + 1, i - arr.length + 1 + arr.length);
                }

            }
        }
        return "";
    }

    public int shortestWordEditPath(String source, String target, String[] words) {
        // your code goes here
        if (countTest(source, words[0]) == -1) {
            return -1;
        }

        // String words[] = {"but", "put", "big", "pot", "pog", "dog", "lot"};
        // System.out.println(shortestWordEditPath("bit", "dog", words));
        int counter = 0;
        int counterValue = 0;
        String lastValue = words[0];

        for (int i = 1; i < words.length; i++) {

            counterValue = countTest(lastValue, words[i]);
           // System.out.println("last:" + lastValue + " words[i]: " + words[i]);
            counter++;
            if (counterValue != -1) {
                lastValue = words[1];
               // System.out.println("Reading" + lastValue + (1));

            }
            if (words[i].equals(target)) {
                System.out.println("Counter: " + counter);
                return counter;
            }

        }
        return -1;
    }

    int countTest(String value1, String value2) {
        if (value1.length() > value2.length()) {
            System.out.println("No match in length");
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < value1.length(); i++) {

            if (value1.charAt(i) != (value2.charAt(i))) {
                counter++;
            }
            if (counter > 1) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SmallestSubstring ss = new SmallestSubstring();
    }
}
