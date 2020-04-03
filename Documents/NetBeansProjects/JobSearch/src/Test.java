
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dotmons
 */
public class Test {

    public Test() {
        Integer a = new Integer(3);
        Integer b = new Integer(3);

        System.out.println(solution(1041));
    }

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        int longestBinaryGap = 0;
        List onesList = new ArrayList();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                continue;
            }
            onesList.add(i);
        }

        for (int i = 0; i < onesList.size() - 1; i++) {
            //subtract 1 so that don't count 1's next to each other as having any gap
            int indicesDiff = (int) onesList.get(i + 1) - (int) onesList.get(i) - 1;

            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
        }
        return longestBinaryGap;
    }

    public static void main(String[] args) {
        new Test();
    }
}
