/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.*;
public class HashSetTest {
    public static void main(String[] args) {
        //Membuat Instance/Objek ArrayList Integer
        HashSet<Integer> data = new HashSet<Integer>();

        //Memasukan Nilai Default
        data.add(0);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        //Memasukan Nilai Duplukat/Yang Sama Dengan Nilai Sebelumnya
        data.add(5);
        data.add(4);
        data.add(3);

        //Menampilkan Daftar Nilai
        System.out.println(data);
    }
}
