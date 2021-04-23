/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class FPBRecursif {
    static int fpb(int x, int y) {
        int fpb = x % y;
        if (fpb != 0) {
            x = y;
            y = fpb;
            fpb = fpb(x, y);
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Input bilangan x : ");
        x = input.nextInt();
        System.out.print("Input bilangan y : ");
        y = input.nextInt();

        System.out.println("Nilai FPB : " + fpb(x, y));
    }
}
