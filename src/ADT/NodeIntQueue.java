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
public class NodeIntQueue {

    private Node front;
    private Node rear;
    private int length;

    private static class Node {

        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enQueue(int item) {
        if (front == null) {
            rear = new Node(item);
            front = rear;
        } else {
            rear.next = new Node(item);
            rear = rear.next;
        }
        length++;
    }

    public int deQueue() {
        if (front != null) {
            int item = front.data;
            front = front.next;
            length--;
            return item;
        }
        return -1;
    }

    public int size() {
        return length;
    }

    public void showQueue() {
        Node currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}

class mainqueueint {
    public static void main(String[] args) {
        NodeQueue queue = new NodeQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println("Panjang Queue : " + queue.size());
        queue.showQueue();
        System.out.println();
        System.out.println("Nilai Dequeue :" + queue.deQueue());
        System.out.println("Panjang Queue :" + queue.size());
        System.out.println("-------------------");
        queue.showQueue();
        System.out.println();
    }
}
