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
public class Fibonacci {

    public Fibonacci() {
        java.util.ArrayList<Integer> si = new java.util.ArrayList();
        si.add(0);
        si.add(1);
        System.out.println(fibonacciRecursion(6));
        for (int i = 2; i <= 10; i++) {
            si.add(si.get(i - 1) + si.get(i - 2));
            //System.out.println(si.get(i));
        }

    }

    public static int fibonacciRecursion(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }
  

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
    }
}
