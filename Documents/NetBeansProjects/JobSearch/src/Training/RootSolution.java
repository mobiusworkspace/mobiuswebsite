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
public class RootSolution {

    public RootSolution() {
        // DecimalFormat df = new DecimalFormat("#.####");
        //System.out.println(solveRoots(9));
        System.out.printf("%.4f", root(7,3));
        //System.out.println(root(81,2));
        System.out.println("\n"+rootVal(7,3));
    }

    static double root(double x, int n) {
        return getRoots(x, n);
    }

    static double getRoots(double x, int n) {
        if (n > 1) {
            return getRoots(solveRoots(x), --n);
        }
        return x;
    }

    static double solveRoots(double x) {
        double leastVal = 0;
        double maxVal = x / 10;
        double sqla = x;
        while (Math.abs(sqla) > 0.0001) {
            maxVal = (leastVal + maxVal) / 2;
            leastVal = x / maxVal;
            sqla = Math.abs(leastVal) - Math.abs(maxVal);
        }
        
        return maxVal;
    }
    
    static double max(int i, double x){
        return x>i?x:i;
    }
    
    static double rootVal(double x, int n){
        if (x==0)
            return 0;
        
        double lowerBound = 0;
        double upperBound = max(1,x);
        double approxRoot = (upperBound+lowerBound)/2;
        
        while(approxRoot - lowerBound >= 0.001){
            
            if (Math.pow(approxRoot, n)>x){
                upperBound = approxRoot;
            }
            else if (Math.pow(approxRoot, n)<x){
                lowerBound = approxRoot;
            }
            else
            {
               break;
            }
            approxRoot = (upperBound+lowerBound)/2;
        }
        return approxRoot;
    }

    public static void main(String[] args) {
        RootSolution so = new RootSolution();
    }
}
