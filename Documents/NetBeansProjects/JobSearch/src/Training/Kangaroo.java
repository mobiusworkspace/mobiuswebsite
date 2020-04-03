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
public class Kangaroo {

    public Kangaroo() {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (((x1 > x2) && (v1 > v2)) || (x2 > x1) && (v2 > v1)) {
            return "NO";
        }

        int k1 = x1 + v1;
        int k2 = x2 + v2;

        if (k1 > k2) {
            while (k1 > k2) {
                k2 += v2;
                k1 += v1;
            }
        } else {
            while (k2 > k1) {
                k2 += v2;
                k1 += v1;
            }
        }
        return k1 == k2 ? "Yes" : "NO";
    }

    public static void main(String[] ags) {
        new Kangaroo();
    }
}
