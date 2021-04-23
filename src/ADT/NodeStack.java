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
public class NodeStack {
    private Node top;
    private int size;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
        size++;

    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void show() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

class main {
    public static void main(String[] args) {
        NodeStack stack = new NodeStack();
        System.out.println("Panjang Stack : " + stack.size());
        System.out.println("Stack Kosong? : " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Panjang Stack : " + stack.size());
        System.out.println("Stack Kosong? : " + stack.isEmpty());
        System.out.println("Peek nilai Stack : " + stack.peek());
        System.out.println("Keluarkan nilai Stack : " + stack.pop());
        System.out.println("Panjang Stack : " + stack.size());
    }
}
