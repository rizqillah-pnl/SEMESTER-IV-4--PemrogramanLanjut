/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

class Link {
    int data;
    Link nextnode;
}

public class Coba {
    public static void main(String[] args) {
        Link a = new Link();
        Link b = new Link();
        Link c = new Link();
        Link d = new Link();

        a.data = 1;
        a.nextnode = b;
        b.data = 2;
        b.nextnode.data = 5;
        Link e = a;
        while (e != null) {
            System.out.println(e.data);
            e = e.nextnode;
        }

    }

}
