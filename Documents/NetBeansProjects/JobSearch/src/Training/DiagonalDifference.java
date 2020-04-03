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
public class DiagonalDifference {

    public DiagonalDifference() {

        int[][] arr = new int[4][4];

        /*
-1 	1 	-7 	-8
-10 	-8 	-5 	-2
0 	9 	7 	-1
4 	4 	-2 	1
         */
        arr[0][0] = -1;
        arr[0][1] = 1;
        arr[0][2] = -7;
        arr[0][3] = -8;
        arr[1][0] = -10;
        arr[1][1] = -8;
        arr[1][2] = -5;
        arr[1][3] = -2;
        arr[2][0] = 0;
        arr[2][1] = 9;
        arr[2][2] = 7;
        arr[2][3] = -1;
        arr[3][0] = 4;
        arr[3][1] = 4;
        arr[3][2] = -2;
        arr[3][3] = 1;

        System.out.println(isAssertEquals(1, diagonalDifference(arr)));

    }

    public boolean isAssertEquals(int expectedValue, int suppliedValue) {
        return expectedValue == suppliedValue;
    }

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

        int crossDiagA = 0;

        for (int i = 0; i < arr.length; i++) {
            crossDiagA += arr[i][i];
            crossDiagA -= arr[i][arr.length - i - 1];
        }
        return java.lang.Math.abs(crossDiagA);
    }

    public static void main(String[] args) {
        DiagonalDifference dd = new DiagonalDifference();
    }
}
