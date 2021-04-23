/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

public class Queue {

    int data[];
    int head;
    int tail = -1;

    public Queue(int size) {
        data = new int[size];
    }

    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (tail == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int dataBaru) {
        if (isEmpty()) {
            tail = head;
            data[tail] = dataBaru;
        } else if (!isFull()) {
            tail++;
            data[tail] = dataBaru;
        } else if (isFull()) {
            System.out.println("antrian sudah penuh");
        }
    }

    public int Dequeue() {
        int temp = data[head];
        for (int i = head; i <= tail - 1; i++) {
            data[i] = data[i + 1];
        }
        tail--;
        return temp;
    }

    public void show() {
        if (!isEmpty()) {
            int index = head;
            while (index <= tail) {
                System.out.print("{" + data[index] + "} ");
                index++;
            }
            System.out.println();
        } else {
            System.out.println("Kosong");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.show();
        queue.Dequeue();
        queue.show();
        queue.Dequeue();
        queue.show();
        queue.Dequeue();
        queue.show();
    }
}
