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
public class NodeQueue<Tipe> {
    private Node<Tipe> front;
    private Node<Tipe> rear;
    private int length;

    private static class Node<Tipe> {

        private final Tipe data;
        private Node<Tipe> next;

        public Node(Tipe data) {
            this.data = data;
        }
    }

    /**
     * Method to EnQueue or insert an Item in Queue(rear)
     *
     * @param data Item to be inserted in Queue
     */
    public void enQueue(Tipe item) {
        if (front == null) {
            rear = new Node<Tipe>(item);
            front = rear;
        } else {
            rear.next = new Node<Tipe>(item);
            rear = rear.next;
        }
        length++;
    }

    /**
     * Method to DeQueue or Remove an Item From Queue
     *
     * @return return DeQueued or Removed Item from queue(front)
     */
    public Tipe deQueue() {
        if (front != null) {
            Tipe item = front.data;
            front = front.next;
            length--;
            return item;
        }
        return null;
    }

    public int size() {
        return length;
    }

    public void showQueue() {
        Node<Tipe> currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}

class mainqueue {
    public static void main(String[] args) {
        NodeQueue<Integer> queue = new NodeQueue<>();
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
