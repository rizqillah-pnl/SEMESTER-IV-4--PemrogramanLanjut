/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursif;

public class DecToOthers {
    public static void main(String args[]) {
        int num = 2;
        int base = 2;
        printBase(num, base);
    }

    static void printBase(int num, int base) {
        int rem = 1;
        String digits = "0123456789abcdef";
        String result = "";
        /* the iterative step */
        while (num != 0) {
            rem = num % base;
            num = num / base;
            result = result.concat(digits.charAt(rem) + "");
        }
        
        /* printing the reverse of the result */
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}
