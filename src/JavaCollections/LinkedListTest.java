/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.*;
public class LinkedListTest {
    public static void main(String[] args) {
        //Membuat Instance/Objek dari LinkedList
        LinkedList buah = new LinkedList();

        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah : " + buah);

        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: " + buah.size());
    }
}
