/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursif;

public class FaktorialRecur {
    static int factorial(int n) {
        if (n == 0) {
            /* The base case */
            return 1;
        } else {
            /* Recursive definition; Self-invocation */
            return factorial(n - 1) * n;
        }
    }

    public static void main(String args[]) {
//        int n = Integer.parseInt(args[0]);
        int n = 5;
        System.out.println(factorial(n));
    }
}
