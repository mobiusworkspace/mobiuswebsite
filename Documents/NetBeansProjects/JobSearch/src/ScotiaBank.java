/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dotmons
 */
public class ScotiaBank {

    public int solution(int[] A) {
        int mult = 1;
        for (int i = 0; i < A.length; i++) {
            mult *= A[i];
        }

        if (mult == 0) {
            return 0;
        }
        return mult < 0 ? -1 : 1;
    }

    public int solutionC(int[] A) {
        boolean isNegative = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                return 0;
            } else if (A[i] < 0) {
                isNegative = !isNegative;
            }
        }
        return isNegative ? -1 : 1;
    }

    public String solutionA(String riddle) {
        StringBuilder builder = new StringBuilder();
        char result = '\0';
        for (int i = 0; i < riddle.length(); i++) {
            if (riddle.charAt(i) == '?') {
                if (i == 0) {
                    getChar(riddle.charAt(i + 1));
                } else if (i == riddle.length() - 1) {
                    getChar(riddle.charAt(i - 1));
                } else {
                    result = getChar(riddle.charAt(i - 1), riddle.charAt(i + 1));
                }

                builder.append(result);
            } else {
                builder.append(riddle.charAt(i));
            }

        }
        return builder.toString();
    }

    private char getChar(char a) {
        int temp = (int) a;

        int tempb = (int) a;

        if (a == temp) {
            return 'b';
        }
        return 'a';
    }

    private char getChar(char a, char b) {
        return 'b';
    }

    public ScotiaBank() {
        int A[] = {1, 2, -3, -5, 1, 6, -3, -5, -1, 9, 8, -5};
        System.out.println(solution(A));
        System.out.println(solutionC(A));
    }

    public static void main(String[] args) {
        new ScotiaBank();
    }
}
