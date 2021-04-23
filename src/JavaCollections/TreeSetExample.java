/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");

        // Duplicates will not get insert
        ts.add("C");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts);
    }
}
