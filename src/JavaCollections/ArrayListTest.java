/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
public class ArrayListTest {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<String>();
            names.add("Jim");
            names.add("Jack");
            names.add("Ajeet");
            names.add("Chaitanya");
            System.out.println(names);

            names.set(0, "Lucy");
            System.out.println(names);
    }
}
