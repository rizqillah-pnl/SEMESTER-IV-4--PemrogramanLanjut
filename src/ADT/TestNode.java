/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

class Node {
    int data;
    /* integer data contained in the node */
    Node nextNode;
    /* the next node in the list */
}

class TestNode {
    public static void main(String args[]) {
        Node head = new Node();
        /* initialize 1st node in the list */
        head.data = 5;
        head.nextNode = new Node();
        head.nextNode.data = 10;
        /* null marks the end of the list */
        head.nextNode.nextNode = null;
        /* print elements of the list */
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.nextNode;
        }
    }
}
