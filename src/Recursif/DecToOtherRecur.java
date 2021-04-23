/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursif;

public class DecToOtherRecur {
    static void printBase(int num, int base) {
        String digits = "0123456789abcdef";
        /* Recursive step*/
        if (num >= base) {
            printBase(num / base, base);
        }
        /* Base case: num < base */
        System.out.print(digits.charAt(num % base));
    }

    public static void main(String args[]) {
        int num = 2;
        int base = 2;
        printBase(num, base);
    }
}
