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
public class FPB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, fpb;
        System.out.print("Input bilangan x : ");
        x = input.nextInt();
        System.out.print("Input bilangan y : ");
        y = input.nextInt();

        fpb = x % y;
        while (fpb != 0) {
            x = y;
            y = fpb;
            fpb = x % y;
        }
        System.out.println("Nilai FPB sebagai berikut : " + y);
    }
}
